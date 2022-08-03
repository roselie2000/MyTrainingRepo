package bankingsystem.test;

import bankingsystem.BankAndCust;

public class BkAndCustTest {

	public static void main(String[] args) {
		BankAndCust bkcust = new BankAndCust();
		bkcust.displayByInnerJoin();
		bkcust.displayByLeftJoin();
		bkcust.displayByRightJoin();
		bkcust.displayByFullJoin();
	}

}
