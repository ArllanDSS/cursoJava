package constructor;

import java.util.Locale;
import java.util.Scanner;

public class application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		String holder;
		int accountNumb;
		double deposit, withdraw;
		Account account;
		
		
		System.out.print("Enter account number: ");
		accountNumb = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		holder = sc.nextLine();
		System.out.print("Is there a initial deposit (y/n)?: ");
		char response = sc.next().charAt(0);

		if (response == 'y') {

			System.out.print("Enter initial deposit value: ");
			deposit = sc.nextDouble();
			account = new Account(holder, accountNumb, deposit);
			
		}
		
		else {
			account = new Account(holder, accountNumb);
		}

		System.out.println("Account data: ");
		System.out.println(account.toString());
		
		System.out.print("Enter a deposit value: ");
		deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.println("Updated account data: ");
		System.out.println(account.toString());
		
		System.out.print("Enter a withdraw value: ");
		withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Updated account data: ");
		System.out.println(account.toString());
		
		sc.close();
	}

}
