<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/top.jsp" %>

<div class="content">
	<table border="1" class="boardList">
		<tr>
			<th>번호</th>
			<th width="65%">제목</th>
			<th width="15%">닉네임</th>
			<th>날짜</th>
			<th>추천</th>
		</tr>
		<c:forEach var="diary" items="${diaryList }">
		<tr>
			<td>${diary.diaryId }</td>
			<td>${diary.title }</td>
			<td>${diary.memberId }</td>
			<td>${diary.modifyDate }</td>
			<td>${diary.evaluation }</td>
		</tr>
		
		</c:forEach>
		<c:if test="${sessionScope.smember != null}">
		<tr>
			
			<td colspan="5"><div class="right"><button onclick="movePage('${contextPath}/diary/insert')">글쓰기</button></div></td>
		</tr>
		</c:if>
	</table>
</div>
</div>
</div>

</body>
</html>

