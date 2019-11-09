package com.blabz.singletone;

public class BillPughSingleton
{
private BillPughSingleton()
	{
		System.out.println("BillPughSingletone");
	}
    
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }

}
