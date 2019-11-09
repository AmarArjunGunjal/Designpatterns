package com.blabz.singletone;

public class StaticBlockSingletone 
{
private static StaticBlockSingletone instance;
    
    private StaticBlockSingletone()
    {
    	System.out.println("static block singletone");
    }
    
    //static block initialization for exception handling
    static{
        try{
            instance = new StaticBlockSingletone();

        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static StaticBlockSingletone getInstance()
    {
        return instance;
    }
}
