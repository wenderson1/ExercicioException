package application;

import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) throws DomainException {
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter account data");
			
			System.out.println("Number: ");
			Integer number = sc.nextInt();
			
			System.out.println("Holder: ");
			String holder = sc.next();
			
			System.out.println("Initial balance: ");
			double balance = sc.nextDouble();
			
			System.out.println("Withdraw Limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number,holder,balance,withdrawLimit);
			
			System.out.println("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			account.Withdraw(amount);
			
			sc.close();
	}
		catch(DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}

}}
