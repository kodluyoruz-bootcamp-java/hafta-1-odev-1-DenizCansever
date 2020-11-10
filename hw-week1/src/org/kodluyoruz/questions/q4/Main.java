package org.kodluyoruz.questions.q4;

import java.util.Scanner;

public class Main {
	
	public double calculate(double number, int counter) {
		if(counter == 1) {
			number = Math.ceil(number);
		} else if (counter == 2) {
			number = Math.floor(number);
		}
		return number;
	}
	
	public void printChoices() {
		System.out.println("\n-------------------------------------------------------\nWelcome to the rounding number app! "
				+ "\nPlease press 1 if you want to round the number to up. \nPlease press 2 if you want to round the number to down."
				+ "\nPlease press 3 if you want to stop the app.\n-------------------------------------------------------");
	}
	
	public void roundingNumberApp(){
			boolean check = true;
			String selection;
			double userNumber;
			Scanner scan = new Scanner(System.in);
			
			try{
				while(check) {
			
				printChoices();
				selection = scan.next();
				int flag = Integer.parseInt(selection);
				 
				
				switch(flag) {
				case 1: 
					System.out.println("\nWould you give me the boolean number?");
					userNumber = Double.parseDouble(scan.next());
					System.out.println("\nOutput: " + calculate(userNumber, 1));
					break;
				
				case 2: 
					System.out.println("Would you give me the boolean number?");
					userNumber = Double.parseDouble(scan.next());
					System.out.println("\nOutput: " + calculate(userNumber, 2));
					break;
				case 3: 
					check = false;
					System.out.println("\n---------\nGood bye!\n---------");
					break;
				default:
					System.out.println("\nPlease enter a number as 1 or 2 or 3 next time!");
			}}
			
	
		} catch (Exception e) {
			System.out.println("\nPlease put only number!");
			roundingNumberApp();
			
		} 
	
	  }
		
	
	public static void main(String[] args) {
	
		Main test = new Main();
		test.roundingNumberApp();
	
 }
}
