package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Banco_Movimentacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Account account;
		double balance = 0;
		double amount = 0;
		
		System.out.print("Enter account number: ");
		int num = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char Resp = sc.next().charAt(0);
		
		if (Resp == 'y' || Resp == 'Y') {
		
			System.out.print("Enter initial deposit value: ");
			balance = sc.nextDouble();		
			account = new Account(num, balance, holder);
		}
		else { 
			account = new Account(num, balance);
		}
		
		System.out.println("Account data: " + account);
		System.out.println();
		System.out.print("Enter a deposit value: ");
		amount = sc.nextDouble();
		account.deposit(amount);
		System.out.println("Updated account data:" + account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		account.withdraw(amount);
		System.out.println("Updated account data:" + account);
		
		
		sc.close();
	}

}
