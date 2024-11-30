package com.codegnan.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class GenericServletDemo_02
 */
@WebServlet("/gen")
public class GenericServletDemo_02 extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		LocalTime time=LocalTime.now();
		int hour=time.getHour();
		String wishMessage="";
		if(hour<12) {
			wishMessage="Good Morning...";
		}else if(hour>12&&hour<17) {
			wishMessage="Good Afternoon...";
		}else {
			wishMessage="Good Evening...";
		}
		out.println("<html>");
		out.println("<body>");
		out.println("<h1 style='color:yellow' align='center'>");
		out.println("Hello Sagar" +wishMessage);
		out.println("</h1></body></html>");
	}

}
