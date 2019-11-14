package com.blabz.singletone;

import java.lang.reflect.Constructor;

public class ReflectionSingletone {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		EagerInitialization instanceOne = EagerInitialization.getInstance();
		SerializedSingletone instanceTwo = null;
		try {
			Constructor[] constructors = SerializedSingletone.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (SerializedSingletone) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}

}
