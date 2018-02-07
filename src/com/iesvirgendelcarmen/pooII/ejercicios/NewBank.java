package com.iesvirgendelcarmen.pooII.ejercicios;

public class NewBank {

	public static void main(String[] args) {
		Bank bank = new Bank("New Bank");
		BankAccount bankAccount1 = new BankAccount();
		BankAccount bankAccount2 = new BankAccount(1500, 2.7);
		System.out.println(bankAccount1);
		System.out.println(bankAccount2);
		for (int i = 0; i < 1000; i++) {
			bank.addAccount(new BankAccount());
			bank.addAccount(new BankAccount(Math.random() * 1000, 
					Math.random() * 5));
		}
		bank.addAccount(bankAccount1);
		//bank.addAccount(bankAccount2);
		System.out.println(bank);
		System.out.println("Account/s wiht greater balance " + 
				bank.getGreaterBalanceAccounts());
		//	System.out.println("Account/s wiht smaller balance " + 
		//			bank.getSmallerBalanceAccounts());
		System.out.println("Number of accounts created  " + 
				BankAccount.getNumberOfAccounts());
	}

}
