<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/top.jsp" %>

<div class="content">
	<hr>
	
	<form id="target" action="${contextPath }/member/login" method="post">
	
	<h1>로그인</h1>
	<table border="1">
		<tr>
			<td>아이디</td>
			<td>
				<input name="email" id="email" placeholder="ex) drawMyLife@naver.com">
			</td>
		</tr>
		<tr>
			<td>패스워드</td>
			<td>
				<input name="pwd" id="pwd" placeholder="********">
			</td>
		</tr>
		
		<tr>
			<td colspan="2">
				<button type="button" onclick="login()">로그인</button>
				<button type="button" onclick="movePage('${contextPath}/member/join')">회원가입</button>
			</td>
		</tr>
		</form>
	</table>
<script>
	function login(){
		if(!emailcheck($('#email').val()))
		{
			alert('이메일 형식을 입력해 주십시오');
			$('#email').val('');
			$('#email').focus();
			return;
		}
		
		if(!inputLengthCheck($('#pwd').val(),1))
		{
			alert('비밀번호를 입력해 주십시오');
			$('#pwd').val('');
			$('#pwd').focus();
			return;
		}		
		$.ajax({
            url : '${contextPath}/member/login',
            type : 'post',
            dataType : 'json',
            data : $('#target').serialize(),
            success:function(data){
            	alert(data.isSucceed);
            	if(data.isSucceed=='iderr'){
            		alert('없는 이메일 입니다.');
        			$('#email').val('');
        			$('#email').focus();
            	}
            	else if(data.isSucceed=='pwerr'){
            		alert('비밀번호 에러입니다.');
        			$('#email').val('');
        			$('#email').focus();
            	}
            	else{
            		movePage('${contextPath}/')
            	}
            }
        });
	}
	
</script>
</div>
</div>
</div>

</body>
</html>

