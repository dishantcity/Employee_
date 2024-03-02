package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.conn.DBConnect;
import com.dao.EmployeeDao;
import com.entity.Employee;

import com.entity.Employee;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String dob = req.getParameter("dob");
		String address = req.getParameter("address");
		String qulification = req.getParameter("qulification");
		String email = req.getParameter("email");
		
		Employee employee = new Employee(name, dob, address, qulification, email);
		
		EmployeeDao dao = new EmployeeDao(DBConnect.getConn());
		
		boolean f = dao.addEmployee(employee);
		
		if (f) {
			System.out.println("Employee Details Submit Successfully");
		}else {
			System.out.println("something wrong on server");
		}
	
	
	}
}
