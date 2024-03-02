package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Employee;
import com.mysql.cj.xdevapi.Result;

public class EmployeeDao {
	
	private Connection conn;

	public EmployeeDao(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public boolean addEmployee(Employee employee) {
		
		boolean f = false;
		
		try {
			
			String sql = "insert into employee(name,dob,address,qulification,email) values(?,?,?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, employee.getFullName());
			ps.setString(2, employee.getDob());
			ps.setString(3, employee.getAddress());
			ps.setString(4, employee.getQulification());
			ps.setString(5, employee.getEmail());
			
			
			int i = ps.executeUpdate();
			
			if(i==1) {
				f = true;
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return f;
	}
	
	public List<Employee> getAllEmployee(){
		List<Employee> list = new ArrayList<Employee>();
		Employee s = null;
		try {
			String sql = "select * from student";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				s.setId(rs.getInt(1));
				s.setFullName(rs.getString(2));
				s.setDob(rs.getString(3));
				s.setAddress(rs.getString(4));
				s.setQulification(rs.getString(5));
				s.setEmail(rs.getString(6));
				list.add(s);
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	public Employee getEmployeeById(int id) {
		Employee s = null;
		
		try {
			String sql = "select * from student where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				s.setId(rs.getInt(1));
				s.setFullName(rs.getString(2));
				s.setDob(rs.getString(3));
				s.setAddress(rs.getString(4));
				s.setQulification(rs.getString(5));
				s.setEmail(rs.getString(6));
				
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return s;
		
	}
	

	
	public boolean updateEmployee(Employee employee) {
		
		boolean f = false;
		
		try {
			
			String sql = "update employee set name=?,dob=?,address=?,qulification=?,email=? where id=?";			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, employee.getFullName());
			ps.setString(2, employee.getDob());
			ps.setString(3, employee.getAddress());
			ps.setString(4, employee.getQulification());
			ps.setString(5, employee.getEmail());
			ps.setInt(6, employee.getId());
			
			int i = ps.executeUpdate();
			
			if(i==1) {
				f = true;
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return f;
	}
	
	
	public boolean deleteEmployee(int id) {
		boolean f = false;
		try {
			String sql = "delete from employee where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			
			if(i==1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

}
