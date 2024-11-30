package com.codegnan.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();		
		String uname=request.getParameter("uname");
		int uage=Integer.parseInt(request.getParameter("uage"));
		String uemail=request.getParameter("uemail");
		String umobile=request.getParameter("umobile");
		if(uage<18||uage>30) {
			response.sendError(504,"User age is not sufficient for this requirement");
			
		}else {
			out.println("<html><body>");
			out.println("<font color:'green'>");
			out.println("<h3>User Registration Details</h3>");
			out.println("</font>");
			out.println("<table border='2'");
			out.println("<html><body>");
			out.println("<tr><td>User Name</td><td>"+uname+"</td></tr>");
			out.println("<tr><td>User Age</td><td>"+uage+"</td></tr>");
			out.println("<tr><td>User Email</td><td>"+uemail+"</td></tr>");
			out.println("<tr><td>User Mobile</td><td>"+umobile+"</td></tr>");
			out.println("</table></body></html>");
		}
	}
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
