package com.blabz.observer;

public interface Subject {

	void Subscriber(Subscriber sub);

	void Unsubscriber(Observer sub);

	void notifysubscriber();

	void upload(String str);

}