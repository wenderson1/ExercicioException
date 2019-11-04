package model.entities;

import model.exception.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private double balance;
	public double withdrawLimit;
	
	public Account(Integer number, String holder, double balance, double withdrawLimit) {
		
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Account() {
		
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void Deposit(double amount) {
		
		balance =+ amount;

		System.out.println( "balance: " + balance);
	}
	
	public void Withdraw(double amount) throws DomainException {
		
		if(amount > withdrawLimit) {
			throw new DomainException("the amount exceeds withdraw limit");
		}
		if(amount > balance) {
			throw new DomainException("not enough balance");
		}
		
		balance = balance - amount;
		
		System.out.println("New balance: " + balance);
	}
	
	
	
	
	
	
}
