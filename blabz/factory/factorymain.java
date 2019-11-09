package com.blabz.factory;

import com.blabz.phonepackage.OS;
import com.blabz.phonepackage.OperatingSystemFactory;

public class factorymain
{
public static void main(String[] args) 
{
	OperatingSystemFactory osf = new OperatingSystemFactory();
	OS obj = osf.getInstance("andoid");
	obj.spec();
	
}
}
