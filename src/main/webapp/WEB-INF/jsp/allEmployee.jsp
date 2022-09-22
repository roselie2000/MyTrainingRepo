<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
	<caption>All Employees</caption>
	<thead>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Designation</th>
			<th>Salary</th>
			<th>Joining Date</th>
			<th>Age</th>
		</tr>
		<tbody>
			<c:forEach var="emp" items="${emp}" varStatus="loop">
				<tr>
					<td>${emp.id }</td>
					<td>${emp.name }</td>
					<td>${emp.designation }</td>
					<td>${emp.joiningDate }</td>
					<td>${emp.age }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<table>
	<caption>Trainee Programmers</caption>
	<thead>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Designation</th>
			<th>Salary</th>
			<th>Joining Date</th>
			<th>Age</th>
		</tr>
		<tbody>
			<c:forEach var="emp" items="${empByDes}" varStatus="loop">
				<tr>
					<td>${emp.id }</td>
					<td>${emp.name }</td>
					<td>${emp.designation }</td>
					<td>${emp.joiningDate }</td>
					<td>${emp.age }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<table>
	<caption>Employee 101</caption>
	<thead>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Designation</th>
			<th>Salary</th>
			<th>Joining Date</th>
			<th>Age</th>
		</tr>
	<tbody>
		<tr>
			<td>${id }</td>
			<td>${name }</td>
			<td>${designation }</td>
			<td>${joiningDate }</td>
			<td>${age }</td>
		</tr>
	</tbody>
	</table>
</body>
</html>