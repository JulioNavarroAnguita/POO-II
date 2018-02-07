package com.iesvirgendelcarmen.pooII.ejercicios;

import java.time.LocalDate;

public class BankAccount {

	private static final String ENTITY 	= "1234";
	private static final String OFFICE  = "5678";
	
	private String accountNumber;
	private double balance = 0;
	private double interest = 2.5;
	private LocalDate createDate = LocalDate.now();
	
	private static int numberOfAccounts = 0;

	public BankAccount(double balance, double interest) {
		this.balance       = balance;
		this.interest      = interest;
		this.accountNumber = generateAccountNumber();
		numberOfAccounts++;
	}

	public BankAccount() {
		this.accountNumber = generateAccountNumber();
		numberOfAccounts++;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	private String getDigitsOfAccount() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < 10; i++) 
			stringBuilder.append((int) (Math.random() * 10));

		return stringBuilder.toString();
	}

	private String generateAccountNumber() {
		final String digitsOfAccount = getDigitsOfAccount();
		
		//first control digit
		class FirstDigitControl {
			private int generateDigit() {
				int sum1 = 0;
				sum1 += (ENTITY.charAt(0) - 48) * 4;
				sum1 += (ENTITY.charAt(1) - 48) * 8;
				sum1 += (ENTITY.charAt(2) - 48) * 5;
				sum1 += (ENTITY.charAt(3) - 48) * 10;
				sum1 += (OFFICE.charAt(0) - 48) * 9;
				sum1 += (OFFICE.charAt(1) - 48) * 7;
				sum1 += (OFFICE.charAt(2) - 48) * 3;
				sum1 += (OFFICE.charAt(3) - 48) * 6;
				int firstControlDigit = 11 - (sum1 % 11);
				if (firstControlDigit == 10)
					firstControlDigit = 1;
				if (firstControlDigit == 11)
					firstControlDigit = 0;
				return firstControlDigit;
			}
		}

		//second control digit
		class SecondDigitControl {
			private int generateDigit() {
				
				int sum2 = 0;
				sum2 += (digitsOfAccount.charAt(0) - 48) * 1;
				sum2 += (digitsOfAccount.charAt(1) - 48) * 2;
				sum2 += (digitsOfAccount.charAt(2) - 48) * 4;
				sum2 += (digitsOfAccount.charAt(3) - 48) * 8;
				sum2 += (digitsOfAccount.charAt(4) - 48) * 5;
				sum2 += (digitsOfAccount.charAt(5) - 48) * 10;
				sum2 += (digitsOfAccount.charAt(6) - 48) * 9;
				sum2 += (digitsOfAccount.charAt(7) - 48) * 7;
				sum2 += (digitsOfAccount.charAt(8) - 48) * 3;
				sum2 += (digitsOfAccount.charAt(9) - 48) * 6;
				int secondControlDigit = 11 - (sum2 % 11);
				if (secondControlDigit == 10)
					secondControlDigit = 1;
				if (secondControlDigit == 11)
					secondControlDigit = 0;
				return secondControlDigit;
			}
			
		}

		FirstDigitControl firstControl  =  new FirstDigitControl();
		int firstControlDigit  = firstControl.generateDigit();
		SecondDigitControl secondControl = new SecondDigitControl();
		int secondControlDigit = secondControl.generateDigit();
		
		return ENTITY + OFFICE + firstControlDigit +
				secondControlDigit + digitsOfAccount;
	}

	public void withDrawMoney(double amount) {
		balance -= amount;
	}
	
	public void depositMoney(double amount) {
		balance += amount;
	}
	
	@Override
	public String toString() {
		return "BankAccount: accountNumber: " + accountNumber + ", balance: " + balance +"€";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		return true;
	}

	
	
	/*public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		System.out.println(bankAccount.generateAccountNumber());
	}*/



}
