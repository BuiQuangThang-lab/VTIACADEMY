package com.vti.ultis.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MessangeProperties {
	private Properties properties;
	
	public MessangeProperties() throws FileNotFoundException, IOException {
		properties = new Properties();
		properties.load(new FileInputStream(DatabaseProperties.RESOURCE_FOLDER_URL + "message.properties"));
	}
	
	public String getProperty(String key) {
		return properties.getProperty(key);
	}
}
