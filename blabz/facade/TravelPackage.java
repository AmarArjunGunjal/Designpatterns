package com.blabz.facade;

public class TravelPackage implements TravelPackagrimpl 
{

	@Override
	public void book() 
	{
		
		FlightBookingImpl flightBookingImpl = new FlightBooking();
		flightBookingImpl.book();
		
		HotelBookingImpl hotelBookingImpl = new HotelBooking();
		hotelBookingImpl.book();
		
		TransferBookingImpl transferBookingImpl = new TransferBooking();
		transferBookingImpl.book();
		
		
		System.out.println("Travel package booked successfully");
	}
	
}
