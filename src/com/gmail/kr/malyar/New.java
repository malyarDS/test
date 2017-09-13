package com.gmail.kr.malyar;

public class New {
	
	public static void main(String[] args) {
		
		Car carOne = new Car();
		
		carOne.color="Grey";
		carOne.weight = 1500;
		carOne.year = 2010;
		
		
		Car carThree = new Car("Blue",1700,1981);
		carThree.print();
	}

}
