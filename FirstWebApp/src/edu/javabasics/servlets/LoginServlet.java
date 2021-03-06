package edu.javabasics.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.javabasics.servlets.util.ConnectionUtil;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName=request.getParameter("uname");
		
		String password=request.getParameter("pwd");
		
		
		
		try {
			Connection conn=ConnectionUtil.getConnection();
			
			String query="SELECT *FROM REGISTER_ACCOUNT WHERE UNAME=? AND PWD=?";
			
			PreparedStatement ps=conn.prepareCall(query);
			ps.setString(1, userName);
			ps.setString(2, password);
			
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				response.sendRedirect("./LoginSuccess.html");
			}else {
				response.sendRedirect("./LoginFailure.html");
			}
			ps.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
