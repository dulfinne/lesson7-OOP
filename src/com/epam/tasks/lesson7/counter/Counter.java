package com.epam.tasks.lesson7.counter;

public class Counter
{
	private int lowerBound;
	private int upperBound;
	private int currentCount;
	
	public Counter()
	{
		currentCount = 100;
		upperBound = 500;
	}
	
	public Counter(int currentCount, int lowerBound, int upperBound)
	{
		this.currentCount = currentCount;
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}
	
	public Counter(int lowerBound)
	{
		currentCount = 100;
		this.lowerBound = lowerBound;
		upperBound = 500;
	}
	
	public int getLowerBound()
	{
		return lowerBound;
	}
	
	public int getUpperBound()
	{
		return upperBound;
	}
	
	public int getCurrentCount()
	{
		return  currentCount;
	}
	
	public void setCurrentCount(int currentCount)
	{
		if(currentCount <= lowerBound && currentCount >= upperBound)
		{
			return;
		}
		
		this.currentCount = currentCount;
	}
	
	public void increment()
	{
		if(currentCount < upperBound)
		{
			currentCount++;
		}
	}
	
	public void decrement()
	{
		if(currentCount > lowerBound)
		{
			currentCount--;
		}
	}
}
