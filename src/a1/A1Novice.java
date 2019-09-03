package a1;

import java.util.Scanner;

public class A1Novice {

	private static Scanner scan;
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int count = scan.nextInt();
		for (int i = 0; i < count; i++) {
			String fName = scan.next();
			String lName = scan.next();
			int items = scan.nextInt();
			double sum = 0;
			for (int j = 0; j < items; j++) {
				int quantity = scan.nextInt();
				String iName = scan.next();
			    double price = scan.nextDouble();
				sum = sum + (quantity * price);
				}
		System.out.println(fName.charAt(0) + ". " + lName + ": " + String.format("%.2f", sum));
		}

		// Your code follows her
		
	}
}
