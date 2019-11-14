package com.blabz.jdbc;

import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class Utility 
{
	
	static Scanner scanner=new Scanner(System.in);
	public  static int ReadIntegers()
	{
		return scanner.nextInt();
	}
	
	public  static  String readString()
	{
		return scanner.nextLine();
	}
	
	public void callable()
	{
		
	}
}
