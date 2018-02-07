package com.iesvirgendelcarmen.pooII.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	private String nameBank;
	private List<BankAccount> listAccount;

	public Bank(String nameBank) {
		this.nameBank = nameBank;
		this.listAccount = new ArrayList<>();
	}

	public boolean addAccount(BankAccount bankAccount) {
		if (!listAccount.contains(bankAccount))
			return listAccount.add(bankAccount);
		else
			return false;
	}

	public boolean removeAccount(BankAccount bankAccount) {
		return listAccount.remove(bankAccount);
	}

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
