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
						<p class="fs-3 text-center">Add Employee</p>
						
						<form action="register" method="post">
						
						 <div class="mb-3">
    <label class="form-label">Full name</label>
    <input type="text" name=""name class="form-control">
    
  </div>
   <div class="mb-3">
    <label class="form-label">DOB</label>
    <input type="date" name="dob" class="form-control">
    
  </div>
   <div class="mb-3">
    <label class="form-label">Address</label>
    <input type="text" name="address" class="form-control">
    
  </div>
   <div class="mb-3">
    <label class="form-label">Qulification</label>
    <input type="text" name="qulification" class="form-control">
    
  </div>
						
  <div class="mb-3">
    <label class="form-label">Email</label>
    <input type="email" name="email" class="form-control">
    
  </div>

  <button type="submit" class="btn btn-primary col-md-12">Submit</button>
</form>
							
						</div>
				</div>
			</div>
		</div>
	</div>
	
	
	
	<div class="card-body"></div>
	
</body>
</html>