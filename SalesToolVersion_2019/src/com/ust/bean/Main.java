package com.ust.bean;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesData objSalesData=new SalesData();
		System.out.println("Welcome to Sales App v2019");
		displayGreeting();
		objSalesData.display();

	}
	private static void displayGreeting(){
		System.out.println("Welcome to Sales App");
		
	}

}
