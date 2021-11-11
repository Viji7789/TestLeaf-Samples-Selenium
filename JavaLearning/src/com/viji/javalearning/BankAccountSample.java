package com.viji.javalearning;

public class BankAccountSample {

	Long account_Number=4567432223l;//long value should end with l
	String userName="ABCD";
	Integer balance=1000;
	
	public void getBalance() {
		System.out.println("Current balance is:"+ balance);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccountSample account=new BankAccountSample();
		System.out.println(account.account_Number);
		System.out.println(account.userName);
		account.getBalance();
	}		
}
