package com.olejarczykjakub.exercise_2;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter A side of a triangle: ");
		double a = sc.nextDouble();
		
		System.out.print("Please, enter B side of a triangle: ");
		double b = sc.nextDouble();
		
		System.out.print("Please, enter C side of a triangle: ");
		double c = sc.nextDouble();
		
		double p = (a + b + c) / 2;		
		double P = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		double ha = 2 * P / a;
		double triangleArea = (a * ha) / 2;
		
		System.out.println("Triangle area is: " + triangleArea);
		sc.close();
	}

}
