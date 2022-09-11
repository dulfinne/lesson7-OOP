package com.epam.tasks.lesson7.counter;

public class Main
{
	public static void main(String[] args)
	{
		Counter counter = new Counter(345, 5, 350);
		
		System.out.println(counter.getCurrentCount());
		
		counter.increment();
		System.out.println(counter.getCurrentCount());

		counter.increment();
		System.out.println(counter.getCurrentCount());

		counter.decrement();
		System.out.println(counter.getCurrentCount());

	}
}
