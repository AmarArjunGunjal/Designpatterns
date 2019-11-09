package com.blabz.singletone;

public enum EnumSingletone 
{
	INSTANCE;
	private int count;
	
	public void setCount(int count) {
		this.count = count;
	}

	public static void enummethod()
	{
		System.out.println("Enum");
	}
}
