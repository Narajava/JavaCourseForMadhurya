package edu.java.basics.collections.map;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesDemo1 {

	public static void main(String[] args) {
		
		try {
			InputStream is=PropertiesDemo1.class.getClassLoader().getResourceAsStream("applicationConf.properties");
			
			Properties prop=new Properties();
			prop.load(is);
			
			System.out.println("Name: "+prop.get("Name"));
			System.out.println("Address: "+prop.get("Address"));
			System.out.println("MobileNo: "+prop.get("MobileNumber"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
