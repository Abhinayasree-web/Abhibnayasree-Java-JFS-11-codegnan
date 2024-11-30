package com.codegnan.factories;
import com.codegnan.action.AccountAction;
public class AccountActionFactory {
	private static AccountAction accountAction = null;
	static {
		accountAction = new AccountAction();
	}
	public static AccountAction getAccountAction() {
		return accountAction;
	}
}
