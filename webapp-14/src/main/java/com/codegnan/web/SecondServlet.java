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
* Servlet implementation class SecondServlet
*/
@WebServlet("/sec")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String accType = request.getParameter("accType");
			float balance = Float.parseFloat(request.getParameter("balance"));
			HttpSession httpSession = request.getSession(false);
			httpSession.setAttribute("accType", accType);
			httpSession.setAttribute("balance", balance);
			out.println("<html>");
			out.println("<body>");
			out.println("<h2 style='color: red;' align='center'>codegnan Banking Services</h2>");
			out.println("<h3 style='color: blue;' align='center'>Account Creation Form[Cont...]</h3>");
			out.println("<form method='POST' action='" + response.encodeURL("./disp") + "'>");
			out.println("<table align='center'>");
			out.println("<tr><td>Account Branch</td><td><input type='text' name='accBranch'></td></tr>");
			out.println("<tr><td>Account Bank</td><td><input type='text' name='accBank'></td></tr>");
			out.println("<tr><td><input type='submit' value='Display'></td></tr>");
			out.println("</table></form></body></html>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
