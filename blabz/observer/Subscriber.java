package com.blabz.observer;

public class Subscriber implements Observer 
{
	private String name;
	@SuppressWarnings("unused")
	private Subject channel = new Channel();
	
	@Override
	public void update()
	{
		System.out.println("Hey  " + name +" , Video Uploaded");
	}
	
	@Override
	public void subscribechannel(Subject ch)
	{
		channel=ch;
	}

	public Subscriber(String name) {
		super();
		this.name = name;
	}
}
