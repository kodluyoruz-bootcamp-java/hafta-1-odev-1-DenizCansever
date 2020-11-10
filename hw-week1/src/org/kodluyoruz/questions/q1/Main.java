package org.kodluyoruz.questions.q1;

import java.util.ArrayList;

public class Main {
	
	
	public void findAritmethicMean() {
		ArrayList<Integer> numbersArray = new ArrayList<Integer>();
		double total = 0;
		double arithmeticMean = 0;
		for(int number = 0; number <= 2000; number++) {
			if(number % 3 == 0 && number % 5 == 0 && number % 7 == 0 && number % 53 == 0) {
				numbersArray.add(number);
			}
			
		}
		for( int i = 0; i < numbersArray.size(); i++) {
			 total += numbersArray.get(i);
		}
		arithmeticMean = total / numbersArray.size();
		System.out.println("Arithmetic mean of the numbers in given condition: " + arithmeticMean);
		
	}
	
	public static void main(String[] args) {
		Main test = new Main();
		test.findAritmethicMean();
		
	}
}