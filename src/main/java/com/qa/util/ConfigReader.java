package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader 
{
	/*
	 * this method id used to read the properties  from the config.properties file
	 * @return
	 */
	
	private Properties prop;
	
	public Properties init_proeprties()
	{
			
		prop=new Properties();
	
		try 
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\Mallukinnis\\eclipse-workspace\\RestAssuredAPIDemo\\CuCumberPOMFrameWork\\src\\test\\resource\\config\\config.properties");
			prop.load(fis);
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		return prop;
		
	}
	
	
}
