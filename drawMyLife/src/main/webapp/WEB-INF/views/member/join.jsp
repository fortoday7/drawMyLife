<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/top.jsp" %>

<div class="content">
	<hr>
	<form id="target" action="${contextPath }/member/join" method="post">
	
	<h1>회원가입</h1>
	<table  border="1">
		<tr>
			<td>아이디</td>
			<td>
				<input type="text" name="email" id="email" placeholder="ex) drawMyLife@naver.com">
			</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>
				<input type="text" name="mname" id="mname" placeholder="ex) 주현태">
			</td>
		</tr>
		<tr>
			<td>패스워드</td>
			<td>
				<input type="password" name="pwd" id="pwd" placeholder="********">
			</td>
		</tr>
		<tr>
			<td>패스워드확인</td>
			<td>
				<input type="password" name="pwdcheck" id="pwdcheck" placeholder="********">
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<button type="button" onclick="join()">회원가입</button>
			</td>
		</tr>
		</form>
	</table>
	
	<script>
		function join(){
			if(!emailcheck( $('#email').val() ))
			{
				alert('이메일 형식이 아닙니다.');
				$('#email').val('');
				$('#email').focus();
				return;
			}
			if(!inputLengthCheck($('#mname').val(),1))
			{
				alert('이름을 두 자 이상 입력하시오');
				$('#mname').val('');
				$('#mname').focus();
				return;
			}
			if($('#pwdcheck').val() != $('#pwd').val())
			{
				alert('비밀번호와 비밀번호체크가 같지 않습니다.');
				$('#pwdcheck').val('');
				$('#pwdcheck').focus();
				return;
			}
			$("#target").submit();
			
			alert('완료');
		}
		
	</script>
</div>
</div>
</div>

</body>
</html>

