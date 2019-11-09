package com.blabz.facade;

public class FacadeClient 
{
public static void main(String[] args) 
{
	TravelPackagrimpl travelPackagrimpl = new TravelPackage();
	travelPackagrimpl.book();
}
}
