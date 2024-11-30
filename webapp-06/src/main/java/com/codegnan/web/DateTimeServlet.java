package com.codegnan.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/reg")
public class DateTimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		LocalDate localDate=LocalDate.now(); 
		String date=localDate.getDayOfMonth()+"----------"+localDate.getMonthValue()+"-------------"+localDate.getYear();
		LocalTime localTime=LocalTime.now();
		String time=localTime.getHour()+"--------"+localTime.getMinute()+"------------"+localTime.getSecond();
		out.println("<html><body><h1 style='color:red' align='center'");
		out.println("Hello User!<br>");
		out.println("Date: "+date);
		out.println("<br>");
		out.println("Time: "+time);
		out.println("</h1></body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		LocalDate localDate=LocalDate.now(); 
		String date=localDate.getDayOfMonth()+"----------"+localDate.getMonthValue()+"-------------"+localDate.getYear();
		
		out.println("<html><body><h1 style='color:red' align='center'");
		out.println("Hello User!<br>");
		out.println("Date: "+date);
		out.println("<br>");
		
		out.println("</h1></body></html>");
	}

}
