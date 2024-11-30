package com.codegnan.web;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
* Servlet implementation class DisplayServlet
*/
@WebServlet("/disp")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String accBranch = request.getParameter("accBranch");
			String accBank = request.getParameter("accBank");
			HttpSession httpSession = request.getSession(false);
			httpSession.setAttribute("accBranch", accBranch);
			httpSession.setAttribute("accBank", accBank);
			String accNo = (String) httpSession.getAttribute("accNo");
			String accHolderName = (String) httpSession.getAttribute("accHolderName");
			String accType = (String) httpSession.getAttribute("accType");
			float balance = (float) httpSession.getAttribute("balance");
			out.println("<html>");
			out.println("<body>");
			out.println("<h2 style='color: red;' align='center'>codegnan Banking Services</h2>");
			out.println("<h3 style='color: blue;' align='center'>Account Details</h3>");
			out.println("<table align='center' border='1'>");
			out.println("<tr><td>Account Number</td><td>" + accNo + "</td></tr>");
			out.println("<tr><td>Account Holder Name</td><td>" + accHolderName + "</td></tr>");
			out.println("<tr><td>Account Type</td><td>" + accType + "</td></tr>");
			out.println("<tr><td>Account Balance</td><td>" + balance + "</td></tr>");
			out.println("<tr><td>Account Branch</td><td>" + accBranch + "</td></tr>");
			out.println("<tr><td>Account Bank</td><td>" + accBank + "</td></tr>");
			out.println("</table>");
			out.println("<form method='POST' action='" + response.encodeURL("./addAndEdit") + "'>");
			out.println("<table align='center'>");
			out.println("<tr><td><input type='submit' value='Confirm'></td></tr>");
			out.println("</table></form></body></html>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
