package com.epam.tasks.lesson7.triangle;

public class Main
{
	public static void main(String[] args)
	{
		Triangle triangle = new Triangle(3, 4, 5);
		
		System.out.println(triangle.perimeter());
		System.out.println(triangle.area());
		System.out.println(triangle.mediana());
		
	}
}
