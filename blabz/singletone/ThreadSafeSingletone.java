package com.blabz.singletone;


public class ThreadSafeSingletone 
{
	
		private static ThreadSafeSingletone instance;
	    
	    private ThreadSafeSingletone()
	    {
	    	System.out.println("thread safe singletone");
	    }
	    
	    public static synchronized ThreadSafeSingletone getInstance(){
	        if(instance == null){
	            instance = new ThreadSafeSingletone();
	        }
	        return instance;
	    }
	}


