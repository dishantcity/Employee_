<%@page import="com.entity.Employee"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.EmployeeDao"%>
<%@page import="com.conn.DBConnect"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="css.jsp" %>
</head>
<body>

	<%@include file="navbar.jsp" %>

	
	<div class="container p-3">
	<p class="text-center" fs-1>All Employee Details</p>
	
	<table class="table">
  <thead>
    <tr>
      <th scope="col">Full Name</th>
      <th scope="col">DOB</th>
      <th scope="col">Address</th>
      <th scope="col">Qulification</th>
      <th scope="col">Email</th>
      <th scope="col">Action</th>
      
    </tr>
  </thead>
  <tbody>
  
  <% 
  EmployeeDao dao = new EmployeeDao(DBConnect.getConn());
  List<Employee> list = dao.getAllEmployee();
  for(Employee s:list)
  {%>
  
  <% 
  }
  %>
  
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
      <td>@mdo</td>
       <td>
       	<a href="edit_employee.jsp" class="btn btn-sm btn-primary">Edit</a>
       	<a href="" class="btn btn-sm btn-danger ms-1">Delete</a>
       </td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Jacob</td>
      <td>Thornton</td>
      <td>@fat</td>
      <td>@mdo</td>
    </tr>
   
  </tbody>
</table>
	
	</div>


</body>
</html>