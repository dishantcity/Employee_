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

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String dob = req.getParameter("dob");
		String address = req.getParameter("address");
		String qulification = req.getParameter("qulification");
		String email = req.getParameter("email");
		int id = Integer.parseInt(req.getParameter("id"));
		Employee employee = new Employee(id, name, dob, address, qulification, email);
		
		EmployeeDao dao = new EmployeeDao(DBConnect.getConn());
		
		boolean f = dao.updateEmployee(employee);
	}
	
	

}
