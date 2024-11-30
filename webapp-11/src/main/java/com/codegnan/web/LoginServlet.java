package com.codegnan.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
		RequestDispatcher requestDispatcher=null;
		if(uname.equals("abhi")&&upwd.equals("abhi123")) {
			requestDispatcher=request.getRequestDispatcher("/success.html");
			requestDispatcher.forward(request, response);
		}else {
			requestDispatcher=request.getRequestDispatcher("/failure.html");
			requestDispatcher.forward(request, response);
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
