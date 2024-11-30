package com.codegnan.Web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class WelcomeServlet  implements Servlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		
		
	}
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1 style='color:red' align='center'>");
		out.println("Welcome to first servlet program");
		out.println("</h1></body></html>");
	}
	
	

	@Override
	public ServletConfig getServletConfig() {
		
		return null;
	}
	
	

	@Override
	public String getServletInfo() {
		
		return null;
	}
	
	

	@Override
	public void destroy() {
				
	}
	
	

}
