<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>USERID</th>
				<th>NAME</th>
				<th>PASSWORD</th>
				<th>EMAIL</th>
				<th>PHONE</th>
				<th>ADMIN</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="member" items="${memberList}">
			<tr>
				<td>${member.userid}</td>
				<td>${member.name}</td>
				<td>${member.pwd}</td>
				<td>${member.email}</td>
				<td>${member.phone}</td>
				<td>${member.admin}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>