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
import com.codegnan.action.AccountAction;
import com.codegnan.beans.Account;
import com.codegnan.factories.AccountActionFactory;
/**
* Servlet implementation class AddAndEditServlet
*/
@WebServlet("/addAndEdit")
public class AddAndEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			HttpSession httpSession = request.getSession(false);
			AccountAction accountAction = AccountActionFactory.getAccountAction();
			Account account = new Account();
			account.setAccNo((String) httpSession.getAttribute("accNo"));
			account.setAccHolderName((String) httpSession.getAttribute("accHolderName"));
			account.setAccType((String) httpSession.getAttribute("accType"));
			account.setBalance((float) httpSession.getAttribute("balance"));
			account.setAccBranch((String) httpSession.getAttribute("accBranch"));
			account.setAccBank((String) httpSession.getAttribute("accBank"));
			String status = accountAction.addAccount(account);
			RequestDispatcher requestDispatcher = null;
			if (status.equalsIgnoreCase("success")) {
				requestDispatcher = request.getRequestDispatcher("/success.html");
				requestDispatcher.forward(request, response);
			} else {
				requestDispatcher = request.getRequestDispatcher("/failure.html");
				requestDispatcher.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
