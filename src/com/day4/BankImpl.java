package com.day4;

public class BankImpl implements Bank {
	int balance;
	
	BankImpl(int balance){
		this.balance=balance;
	}
	@Override
	public void deposit(int amount) {
		System.out.println("Depositing Rs."+amount);
		balance +=amount;//balance= balance+amount
		System.out.println("Amount deposited sucessfully!");
		}
	@Override
	public void withdraw(int amount) {
		if(amount <= balance) {
			System.out.println("Withdraw Rs."+amount);
		
		balance -=amount;//balance=blance-amount
		System.out.println("Amount withdraw Sucessfully!");
		}
		else {
			try {
				throw new InsufficientBalanceException("Insufficient Balance");
			
		}
			catch(Exception e) {
				System.out.println(e.getMessage());
				}
			}
			
		
		
	}
	@Override
	public void checkBalance() {
		System.out.println("Available Balance: Rs."+ balance);
		
	}

}
