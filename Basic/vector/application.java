package vector;

import java.util.Scanner;

public class application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Guest[] guest = new Guest[10];
		
		System.out.print("How many rooms will be rented? ");
		int roomQty = sc.nextInt();
		
		for (int i = 0; i < roomQty; i++) {

			System.out.println("Rent #" + (i+1));
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			

			guest[room] = new Guest(name, email, room);
			
		}
		
		System.out.println("Busy rooms: ");
		
		for(int i = 0; i < guest.length; i++) {
			
			if(guest[i] != null) {
				
				System.out.println(i + ": " + guest[i].getName() + ", " + guest[i].getEmail());
				
			}
			
		}

		sc.close();

	}

}
