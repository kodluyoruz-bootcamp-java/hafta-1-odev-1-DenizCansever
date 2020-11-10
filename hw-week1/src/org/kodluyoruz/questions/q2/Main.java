package org.kodluyoruz.questions.q2;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = new Car("Ferrari", "458 Spider", 4000000, 0);
		
		System.out.println(car.toString());
		System.out.println("------------------------------------------");
		System.out.println(car2.toString());

	}

}
