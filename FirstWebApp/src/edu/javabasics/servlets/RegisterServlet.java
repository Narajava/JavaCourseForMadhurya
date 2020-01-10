package edu.javabasics.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.javabasics.servlets.util.ConnectionUtil;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// read the input into variables
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		String gender=request.getParameter("gender");
		String address=request.getParameter("address");
		String state=request.getParameter("state");
		
		try {
			Connection conn=ConnectionUtil.getConnection();
			
			String query="INSERT INTO REGISTER_ACCOUNT VALUES(?,?,?,?,?,?,?)";
			
			PreparedStatement ps=conn.prepareCall(query);
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, uname);
			ps.setString(4, pwd);
			ps.setString(5, gender);
			ps.setString(6, address);
			ps.setString(7, state);
			
			int result=ps.executeUpdate();
			
			if(result >0) {
				response.getWriter().append("Registration success");
			}else {
				response.getWriter().append("Registration failure");
			}
			
			ps.close();
			conn.close();
			
		} catch (SQLException e) {
			System.out.println("Exception Details"+e);
		}
	
	}

}
