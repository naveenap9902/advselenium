package com.crm.comcast.generalUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
/**
 * 
 * @author NAVEEN PATIL
 *
 */
public class PropertiesFileUtility 
{
	/**
	 * 
	 * @param key
	 * @return it will return the string value
	 * @throws Throwable
	 */
	public String 	getPropertyKeyValue(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./data/commonData.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String val = pobj.getProperty(key);
		return val;
	}

}
