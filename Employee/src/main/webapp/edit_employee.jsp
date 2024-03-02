<%@page import="com.entity.Employee"%>
<%@page import="com.conn.DBConnect"%>
<%@page import="com.dao.EmployeeDao"%>
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
	
	<div class="container p-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card"></div>
						<div class="card-body">
						<p class="fs-3 text-center">Edit Employee</p>
						
						
						<%
						int id = Integer.parseInt(request.getParameter("id"));
						EmployeeDao dao = new EmployeeDao(DBConnect.getConn());
						Employee s = dao.getEmployeeById(id);
						
						%>
						
						<form action="update" method="post">
						
						 <div class="mb-3">
    <label class="form-label">Full name</label>
    <input type="text" value="<%=s.getFullName()%>" name=""name class="form-control">
    
  </div>
   <div class="mb-3">
    <label class="form-label">DOB</label>
    <input type="date" value="<%=s.getDob() %>" name="dob" class="form-control">
    
  </div>
   <div class="mb-3">
    <label class="form-label">Address</label>
    <input type="text" value="<%=s.getAddress()%>" name="address" class="form-control">
    
  </div>
   <div class="mb-3">
    <label class="form-label">Qulification</label>
    <input type="text" value="<%=s.getQulification()%>" name="qulification" class="form-control">
    
  </div>
						
  <div class="mb-3">
    <label class="form-label">Email</label>
    <input type="email" value="<%=s.getEmail()%>" name="email" class="form-control">
    
  </div>
  
  <input type="hidden" name="id" value="<%=s.getId()%>">

  <button type="submit" class="btn btn-primary col-md-12">Update</button>
</form>
							
						</div>
				</div>
			</div>
		</div>
	</div>
	
	
	
	<div class="card-body"></div>
	
</body>
</html>