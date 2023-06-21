package com.day4;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		System.out.println("Welcome to ICIC Bank");
		System.out.println("-------------------");

		Scanner scan =new Scanner(System.in);
         
		Bank bank = new   BankImpl(50005);//upcasting for achieving abstraction

		while(true) {//infinite Loop
			// to make next looping wait for 1 second
            try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("1:Deposit Amount\n2:Withdraw Amount");
			System.out.println("3:Check balance\n4:Exit");
			System.out.println("enter choice:");
			int choice=scan.nextInt();

			switch(choice) 
			{


			case 1:

				System.out.println("Enter amount to be deposited:");
				int amountTODeposit =  scan.nextInt();
				bank.deposit(amountTODeposit);//bank.deposit(scan.nextInt());
				break;
			case 2:

				System.out.println("Enter amount to be withdrawn:");
				int amountTOWithdraw =  scan.nextInt();
				bank.withdraw(amountTOWithdraw);//bank.deposit(scan.nextInt());
				break;
			case 3:

				bank.checkBalance();
				break;

			case 4:
				System.out.println("exit");
				System.exit(0);
			default :
				System.out.println("Invalid choice");


			}

		
		System.out.println("----------------");
		}


	}


}


