package com.epam.tasks.lesson7.student;

public class Student
{
	private String name;
	private String group;
	private int[] grades;
	
	public Student(String name, String group, int[] grades)
	{
		this.name = name;
		this.group = group;
		this.grades = grades;
	}
	
	public Student()
	{
		name = "";
		group = "";
		grades = new int[0];
	}

	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getGroup()
	{
		return group;
	}
	
	public void setGroup(String group)
	{
		this.group = group;
	}
	
	public int[] getGrades()
	{
		return grades;
	}
	
	public void setGrades(int[] grades)
	{
		this.grades = grades;
	}
	
	public boolean isGreat()
	{
		for(int i = 0; i < grades.length; i++)
		{
			if(grades[i] < 9)
			{
				return false;
			}
		}
		return true;
	}
}
