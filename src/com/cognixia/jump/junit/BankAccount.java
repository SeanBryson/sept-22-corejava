package com.cognixia.jump.junit;

public class BankAccount {
	
	public static enum AccountType {
		CHECKING, SAVINGS
	}
	
	private int balance;
	private AccountType accountType;

	
	public BankAccount() {
		this(0, AccountType.CHECKING);
	}
	
	public BankAccount(int balance, AccountType accountType) {
		if (balance < 0) balance = 0;
		this.balance = balance;
		this.accountType = accountType;
	}

	
	public int getBalance() {
		return balance;
	}

	public AccountType getAccountType() { // no setter, once an account is set
		return accountType;				  // we don't want to change it
	}
	
	// will have a deposit and withdraw methods instead to change balance
	
	public void deposit(int amount) {
		if (amount > 0)
			this.balance += amount;
	}
	
	public void withdraw(int amount) throws OverdraftException {
		
		if (amount > balance) {
			throw new OverdraftException(amount, balance);
		} else if (amount > 0) 
			this.balance -= amount;
	}
}
