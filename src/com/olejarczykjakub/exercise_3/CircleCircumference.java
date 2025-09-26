package com.olejarczykjakub.exercise_3;

import java.util.Scanner;

public class CircleCircumference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter circle radius: ");
		
		double r = sc.nextDouble();
		double curcleCircumference = 2 * Math.PI * r;
		
		System.out.println("Circle circumference is: " + curcleCircumference);
		
		sc.close();
	}

}
