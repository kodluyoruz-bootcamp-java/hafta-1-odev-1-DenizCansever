package org.kodluyoruz.questions.q2;

public class Car {
	private String brand;
	private String model;
	private int price;
	private int km;


	public Car() {
		this("Ford","Mustang Shelby Gt500", 130000 ,100000);
	}
	
	public Car(String brand, String model, int price, int km) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.km = km;
	}



	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	@Override
	public String toString() {
		return "This car's brand is " + brand + "\nThis car's model is " + model + "\nPrice of car is " + price + "TL" + "\nKm of car is " + km;
	}
	
	
}	