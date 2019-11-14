package com.blabz.phonepackage;

public class OperatingSystemFactory {
	public OS getInstance(String str) {
		if (str.equals("andoid")) {
			return new Android();
		} else if (str.equals("ios")) {
			return new IOS();
		} else {
			return new Windows();
		}
	}
}
