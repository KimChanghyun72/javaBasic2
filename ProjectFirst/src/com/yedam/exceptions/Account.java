package com.yedam.exceptions;

public class Account {
	private long balance;
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficientException {
		if(this.balance>=money) {
			this.balance -= money;
		}else {
			throw new BalanceInsufficientException("잔고 부족 : " + (money-balance) + "원 부족");
		}
	}
}
