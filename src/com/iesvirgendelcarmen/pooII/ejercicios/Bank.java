package com.iesvirgendelcarmen.pooII.ejercicios;

import java.util.ArrayList;
import java.util.List;
/**
 * Class Bank .....
 * @author programacion
 * @version 1.0
 */
public class Bank {

	private String nameBank;
	private List<BankAccount> listAccount;
	
	/**
	 * 
	 * @param nameBank String, name of the bank
	 */
	public Bank(String nameBank) {
		this.nameBank = nameBank;
		this.listAccount = new ArrayList<>();
	}
	/**
	 * 
	 * @param bankAccount BankAccount, object ...
	 * @return true if, only if add a new account is successfully
	 */
	public boolean addAccount(BankAccount bankAccount) {
		if (!listAccount.contains(bankAccount))
			return listAccount.add(bankAccount);
		else
			return false;
	}

	/**
	 * 
	 * @param bankAccount BankAccount, object ...
	 * @return true if, only if delete an account is successfully
	 */
	public boolean removeAccount(BankAccount bankAccount) {
		return listAccount.remove(bankAccount);
	}

	/**
	 * 
	 * @return List<BankAccount> which contains a list of account
	 * with the greater balance
	 */
	public List<BankAccount> getGreaterBalanceAccounts() {
		List<BankAccount> listGreaterBalanceAccounts =
				new ArrayList<>();
		double maxBalance = listAccount.get(0).getBalance();
		//BankAccount bankAccountGreaterBalance =	listAccount.get(0);
		for (BankAccount bankAccount : listAccount) {
			if (bankAccount.getBalance() >= maxBalance) {
				if (bankAccount.getBalance() > maxBalance) {
					listGreaterBalanceAccounts.clear();
					//bankAccountGreaterBalance = bankAccount;
					maxBalance = bankAccount.getBalance();
				}
				listGreaterBalanceAccounts.add(bankAccount);

			}
		}
		return listGreaterBalanceAccounts;
	}
	
	/**
	 * 
	 * @return List<BankAccount> which contains a list of account
	 * with the smaller balance
	 */
	public List<BankAccount> getSmallerBalanceAccounts() {
		List<BankAccount> listSmallerBalanceAccounts =
				new ArrayList<>();
		double minBalance = listAccount.get(0).getBalance();

		for (BankAccount bankAccount : listAccount) {
			if (bankAccount.getBalance() <= minBalance) {
				if (bankAccount.getBalance() < minBalance) {
					listSmallerBalanceAccounts.clear();
					minBalance = bankAccount.getBalance();
				}
				listSmallerBalanceAccounts.add(bankAccount);
			}
		}
		return listSmallerBalanceAccounts;
	}

	/**
	 * 
	 * @return double, medium average balance of the all accounts
	 */
	private double calculateAverageBalance() {
		double sum = 0;
		for (BankAccount bankAccount : listAccount) {
			sum += bankAccount.getBalance();
		}
		return (Math.round((sum / listAccount.size()) * 100.0)) / 100.0;
	}

	@Override
	public String toString() {
		return "Bank, number of accounts: " + listAccount.size() +
				" Medium averages balance " + calculateAverageBalance();

	}



}
