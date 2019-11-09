package com.blabz.singletone;

public class LazyInitializedSingletone 
{
	 private static LazyInitializedSingletone instance;
	    
	    private LazyInitializedSingletone()
	    {
	    	System.out.println("lazy singletone");
	    }
	    
	    public static LazyInitializedSingletone getInstance(){
	        if(instance == null){
	            instance = new LazyInitializedSingletone();
	        }
	        return instance;
	    }
}
