package appAbstractClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import abstractClassEntities.Company;
import abstractClassEntities.Individual;
import abstractClassEntities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int nTaxPayer = sc.nextInt();
		
		for (int i = 1; i <= nTaxPayer; i++) {

			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char payerType = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			if (payerType == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpends = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpends));
			} else {
				System.out.print("Number of Employees: ");
				int nOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, nOfEmployees));
			}

		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for(TaxPayer x : list) {
			System.out.println(x);
		}
		
		System.out.println();
		
		double totalTaxes = 0.0;
		for(TaxPayer x : list) {
			totalTaxes += x.taxAmount();
		}
		System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);
		
		sc.close();
	}

}
