package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int store = scan.nextInt();
		
		String[] iName = new String[store];
		double[] iPrice = new double[store];
		
		
		
		for (int i = 0; i < store; i++) {
			iName[i] = scan.next();
			iPrice[i] = scan.nextDouble();
		}
		
		int count = scan.nextInt();
		
		String[] people = new String[count];
		double[] amount = new double[count];
		
			for (int i = 0; i < count; i++) {
			String fName = scan.next();
			String lName = scan.next();
			int items = scan.nextInt();
			double sum = 0;
			people[i] = fName + " " + lName;
			for (int j = 0; j < items; j++) {
				
				int quantity = scan.nextInt();
				String itemName = scan.next();
				for (int k = 0; k < iName.length; k++) {
					int state = itemName.compareTo(iName[k]);
					if (state == 0) {
						sum += (iPrice[k] * quantity);
						amount[i] = sum;
					}
					
				}
				
			}
		}
		
		for (int i = 0; i < amount.length; i++) {
			if (max(amount) == amount[i]) {
				System.out.println("Biggest: " + people[i] + " (" + max(amount) + ")"); 
			}
		}
		
		for (int i = 0; i < amount.length; i++) {
			if (min(amount) == amount[i]) {
				System.out.println("Smallest: " + people[i] + " (" + amount[i] + ")"); 
			}
		}
		
		System.out.println("Average: " + String.format("%.2f", average(amount)));

		// Your code follows heres
		
	}
	public static double max (double[] amount) {
			double m = amount[0];
			for (int i = 1; i < amount.length; i++) {
				if (amount[i] > m) {
					m = amount[i];
				}
			}
			return m;
		}
	static double average (double[] vals) {
		double sum = 0;
		for (int i = 0; i < vals.length; i++) {
			sum += vals[i];
		}
		return sum / vals.length;
	}
	public static double min (double[] vals) {
		double m = vals[0];
		for (int i = 1; i < vals.length; i++) {
			if (vals[i] < m) {
				m = vals[i];
			}
		}
		return m;
	}
}
