package com.codegnan.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
		
		out.println("<html><body>");
		out.println("<h1 style='color:red' align='center'");
		if(uname.equals("codegnan")&&upwd.equals("codegnan123")) {
		out.println("Login Success");
	}else {
		out.println("Login Failure");
	}
		out.println("</h1>");
		out.println("<h3 align='center'>");
		out.println("<a href='loginform.html'>|Login Form|</a>");
		out.println("</body></html>");
		out.close();
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
