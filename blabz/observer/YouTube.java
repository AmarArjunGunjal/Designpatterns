package com.blabz.observer;

public class YouTube 
{
	public static void main(String[] args) {
		
		Subject amar= new Channel();
		
		Subscriber s1 =new Subscriber( "mayur");
		Subscriber s2 =new Subscriber( "vivek");
		Subscriber s3 =new Subscriber( "dipak");
		Subscriber s4 =new Subscriber( "manish");
		Subscriber s5 =new Subscriber( "samir");
		
		amar.Subscriber(s1);
		amar.Subscriber(s2);
		amar.Subscriber(s3);
		amar.Subscriber(s4);
		amar.Subscriber(s5);
		
		amar.Unsubscriber(s3);
		
		s1.subscribechannel(amar);
		s2.subscribechannel(amar);
		s3.subscribechannel(amar);
		s4.subscribechannel(amar);
		s5.subscribechannel(amar);

		amar.upload("abc");
	}
	
}
