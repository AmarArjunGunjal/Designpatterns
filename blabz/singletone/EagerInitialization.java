package com.blabz.singletone;

public class EagerInitialization
{
	private static final EagerInitialization instance = new EagerInitialization();

	// private constructor to avoid client applications to use constructor
	private EagerInitialization() {
		System.out.println("Eager instance created");
	}

	public static EagerInitialization getInstance() {
		return instance;
	}

}
