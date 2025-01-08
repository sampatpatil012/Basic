package com.UtilityLayer;

import java.io.FileInputStream;
import java.util.Properties;

import com.BaseLayer.BaseClass;

public class PropertiesHelper extends BaseClass {

	public static String getProperties(String keyName) throws Exception {

		Properties prop = new Properties();
		String path = "C:\\Users\\Shree-Swami\\eclipse-workspace\\personal\\com.Goibibo_cucumber\\src\\main\\java\\com\\configLayer\\config.properties";
		FileInputStream fis = new FileInputStream(path);

		prop.load(fis);

		String value = prop.getProperty(keyName);
		return value;

	}
}