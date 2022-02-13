package appPolymorphism;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import polymorphismEntities.ImportedProduct;
import polymorphismEntities.Product;
import polymorphismEntities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> products = new ArrayList<>();
		
		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used ou imported (c/u/i)? ");
			char productType = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if(productType == 'i') {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				
				products.add(new ImportedProduct(name, price, customsFee));
			}
			else if(productType == 'u'){
				
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				
				products.add(new UsedProduct(name, price, manufactureDate));

			}
			else {
				products.add(new Product(name, price));
			}
	
		}
		
		System.out.println("PRICE TAGS:");
		for(Product x : products) {
			System.out.println(x.priceTag());
		}
		
		sc.close();
		

	}

}
