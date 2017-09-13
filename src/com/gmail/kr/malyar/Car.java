package com.gmail.kr.malyar;

public class Car {
	String color;
	double weight;
	int year;
	private double velosity = 0;

	public Car(String color, double weight, int year) {
		this.color = color;
		this.weight = weight;
		this.year = year;
	}

	public Car() {
		super();
	}

	public void beep() {

		System.out.println("BEEP-BEEP!!!");
	}

	public void acceleration(double a) {
		velosity = velosity + a;
	}

	public void deceleration(double b) {
		if (velosity - b >= 0)
			velosity = velosity - b;
	}

	public void print() {
		System.out.println("Color: " + color);
		System.out.println("Weight: " + weight);
		System.out.println("Year car: " + year);
		System.out.println("Velosity: " + velosity);
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", weight=" + weight + ", year=" + year + ", velosity=" + velosity + "]";
	}

}
