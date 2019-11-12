package com.blabz.singletone;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class SingletonSerializedTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		SerializedSingletone instanceOne = SerializedSingletone.getInstance();
		ObjectInput out = new ObjectInputStream(new FileInputStream(
                "filename.ser"));
	                
	       // out.writeObject(instanceOne);
	        out.close();
	        
	        //deserailize from file to object
	        ObjectInput in = new ObjectInputStream(new FileInputStream(
	                "filename.ser"));
	        SerializedSingletone instanceTwo = (SerializedSingletone) in.readObject();
	        in.close();
	        
	        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
	        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
	        
	    }

}
