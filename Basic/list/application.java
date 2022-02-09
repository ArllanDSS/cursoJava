package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> emp = new ArrayList<>();
		
		
		System.out.println("How many employees will be resgistered? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Employee #" + (i + 1) + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
		
			emp.add(new Employee(id, name, salary));
			
		}
		
		
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee resultId = emp.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(resultId == null) {
			
			System.out.println("This id does not exist!");
			
		}
		else {
			
			System.out.print("Enter the percentage: ");
			double increase = sc.nextDouble();
			
			resultId.salaryIncrease(increase);
			
		}
		
		System.out.println("List of Employee: ");
		
		for(Employee x : emp) {
			
			System.out.println(x.toString());;
			
		}
		
		
		sc.close();
	}

}
