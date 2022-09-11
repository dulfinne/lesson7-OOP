package com.epam.tasks.lesson7.triangle;

public class Triangle
{
	private int a;
	private int b;
	private int c;
	
	public Triangle()
	{
		
	}
	
	public Triangle(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int getA()
	{
		return a;
	}

	public void setA(int a)
	{
		this.a = a;
	}
	
	public int getB()
	{
		return a;
	}
	
	public void setB(int b)
	{
		this.b = b;
	}
	
	public int getC()
	{
		return a;
	}
	
	public void setC(int c)
	{
		this.c = c;
	}
	
	public int perimeter()
	{
		return a + b + c;
	}
	
	public double area()
	{
		double p = perimeter() / 2;
		
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
	public double mediana()
	{
		return Math.sqrt(2 * Math.pow(a,2) + 2 * Math.pow(b,2) - Math.pow(c,2)) / 2;
	}
}
