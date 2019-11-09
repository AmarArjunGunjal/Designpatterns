package com.blabz.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject
{
	List<Subscriber> subscriber = new ArrayList<>();
	private String title;
	
	
	@Override
	public void Subscriber(Subscriber sub)
	{
		subscriber.add(sub);
	}
	
	@Override
	public void Unsubscriber(Observer sub)
	{
		subscriber.remove(sub);
	}
	
	@Override
	public void notifysubscriber()
	{
		for(Observer sub : subscriber)
		{
			sub.update();
		}
	}
	
	@Override
	public void upload(String str)
	{
		this.title=title;
		notifysubscriber();
	}
}
