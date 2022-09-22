<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=utf-8" />
<title>Insert title here</title>
</head>
<body>
<div>
<form action="addEmployee" method="post">
<label>Employee Id</label>
<input type="text" placeholder="Enter the Employee Id" name="id">
<label>Employee Name</label>
<input type="text" placeholder="Enter the Employee Name" name="name">
<label>Designation</label>
<input type="text" placeholder="Enter the designation of the Employee" name="designation">
<label>Salary</label>
<input type="text" placeholder="Enter the salary of the Employee" name="salary">
<label>Joining Date</label>
<input type="date" name="joiningDate">
<label>Age</label>
<input type="number" placeholder="Enter the age of the Employee" name="age">
<input type="submit" value="submit">
</form>
</div>
</body>
</html>