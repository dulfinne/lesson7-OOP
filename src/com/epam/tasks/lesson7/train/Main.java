package com.epam.tasks.lesson7.train;

import com.epam.tasks.lesson7.student.Student;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		Train[] trains = new Train[5];
		trains[0] = new Train("SPB", 324, 1700);
		trains[1] = new Train("Gomel", 334, 1305);
		trains[2] = new Train("Moscow", 754, 945);
		trains[3] = new Train("SPB", 326, 630);
		trains[4] = new Train("Minsk", 387, 1103);
		
		viewSchedule(trains);
		trainNumberSort(trains);
		viewSchedule(trains);
		destinationSort(trains);
		viewSchedule(trains);
		
		System.out.print("Enter train's number: ");
		int n = Integer.parseInt(scan.nextLine());
		for(Train train : trains)
		{
			if(train.getTrainNumber() == n)
			{
				System.out.println(getLine(train));
			}
		}

	}
	
	public static void trainNumberSort(Train[] trains)
	{
		for(int i = 0; i < trains.length; i++)
		{
			for(int j = 0; j < trains.length; j++)
			{
				if(trains[i].getTrainNumber() < trains[j].getTrainNumber())
				{
					Train temp = trains[i];
					trains[i] = trains[j];
					trains[j] = temp;
				}
			}
		}
	}
	
	public static void destinationSort(Train[] trains)
	{
		for(int i = 0; i < trains.length; i++)
		{
			for(int j = 0; j < trains.length; j++)
			{
				if(trains[i].getDestination().compareTo(trains[j].getDestination()) < 0)
				{
					Train temp = trains[i];
					trains[i] = trains[j];
					trains[j] = temp;
				}
			}
		}
	}
	
	public static void viewSchedule(Train[] trains) 
	{
		for(Train train : trains) 
		{
			System.out.println(getLine(train));			
		}
		System.out.println();
	}
	
	public static String getLine(Train train)
	{
		return train.getDestination() + " " +
				train.getTrainNumber() + " " +
				train.getDepartureTime();
	}
}
