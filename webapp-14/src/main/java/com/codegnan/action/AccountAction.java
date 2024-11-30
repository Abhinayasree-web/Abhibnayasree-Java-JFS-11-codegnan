package com.codegnan.action;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.codegnan.beans.Account;
import com.codegnan.factories.ConnectionFactory;
public class AccountAction {
	public String addAccount(Account account) {
		String status = "";
		try {
			Connection connection = ConnectionFactory.getConnection();
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into account values(?,?,?,?,?,?)");
			preparedStatement.setString(1, account.getAccNo());
			preparedStatement.setString(2, account.getAccHolderName());
			preparedStatement.setString(3, account.getAccType());
			preparedStatement.setFloat(4, account.getBalance());
			preparedStatement.setString(5, account.getAccBranch());
			preparedStatement.setString(6, account.getAccBank());
			int rowCount = preparedStatement.executeUpdate();
			if (rowCount == 1) {
				status = "success";
			} else {
				status = "failure";
			}
		} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		return status;
	}
}
