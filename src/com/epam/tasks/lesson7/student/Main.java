package com.epam.tasks.lesson7.student;

public class Main
{
	public static void main(String[] args)
	{
		String name = "Halubtsov A.V.";
		String group = "DSF-211";
		int[] grades = {9, 10, 10, 9, 9};
		Student student = new Student(name, group, grades);
		
		if(student.isGreat())
		{
			System.out.println(student.getName() + " " + student.getGroup());
		}
	}
}
