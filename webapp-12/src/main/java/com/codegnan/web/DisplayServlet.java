package com.codegnan.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/display")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String uemail=request.getParameter("uemail");
	String umobile=request.getParameter("umobile");
	HttpSession hs=request.getSession();
	String uname=(String) hs.getAttribute("uname");
	String uage=(String) hs.getAttribute("uage");
	String uqual=(String) hs.getAttribute("uqual");
	String udesig=(String) hs.getAttribute("udesig");
	out.println("<html>");
	out.println("<body bgcolor='lightyellow'>");
	out.println("<center><br><br>");
	out.println("<table bgcolor='lightgreen'>");
	out.println("<tr><td colspan='2'><center><b>");
	out.println("<font size='5' color='red'><u>RegistrationDetails</u><b></center></td></tr>");
	out.println("<tr><td>User Name </td><td>"+uname+"</td></tr>");
	out.println("<tr><td>User Age </td><td>"+uage+"</td></tr>");
	out.println("<tr><td>User Qualification </td><td>"+uqual+"</td></tr>");
	out.println("<tr><td>User Designation </td><td>"+udesig+"</td></tr>");
	out.println("<tr><td>User Email </td><td>"+uemail+"</td></tr>");
	out.println("<tr><td>User Mobile </td><td>"+umobile+"</td></tr>");
	out.println("<tr><td>Status</td><td> Success </td></tr>");
	out.println("</table></center></body></html>");
	
}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
