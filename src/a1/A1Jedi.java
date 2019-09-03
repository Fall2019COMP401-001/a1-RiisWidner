package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Jedi {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int store = scan.nextInt();
		
		String[] items = new String[store];
		double[] itemsPrice = new double[store];
		
		for (int i = 0; i < store; i++) {
			items[i] = scan.next();
			itemsPrice[i] = scan.nextDouble();
		}
		
		int[] customerCount = new int[store];
		int[] itemCount = new int[store];
		int count = scan.nextInt();
		
		for (int i = 0; i < count; i++) {
			String fName = scan.next();
			String lName = scan.next();
			int shop = scan.nextInt();
			Boolean[] increased = new Boolean[store];
				Arrays.fill(increased, false);
			for (int j = 0; j < shop; j++) {
				int iCount = scan.nextInt();
				String iName = scan.next();
				
				for (int k = 0; k < store; k++) {
					int state = (iName.compareTo(items[k]));
					if (state == 0) {
						itemCount[k] += iCount;
						if (!increased[k]) {
								customerCount[k]++;
								increased[k] = true;
						}
					}
				}
			}
		}
		for (int i = 0; i < store; i++) {
			if (customerCount[i] == 0) {
				System.out.println("No customers bought " + items[i]);
			} else {
			System.out.println(customerCount[i] + " customers bought " + itemCount[i] + " " + items[i]);
			}
		// Your code follows her
		}
}
}
