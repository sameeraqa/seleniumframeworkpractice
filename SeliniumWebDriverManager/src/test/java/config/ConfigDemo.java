package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import practice.TestNgDemo;

public class ConfigDemo {
	
	private static Logger log =LogManager.getLogger(ConfigDemo.class);
	
	static String path=System.getProperty("user.dir");
	static Properties prop =new Properties();
	public static String browsername=null;
	

	public static void main(String[] args) {
		
		getProperties();
	   	setProperties();
	   	
	}
	
	
	 
	
	public static void getProperties() {
		
		//Reading property files
		try {		
			
 			InputStream input = new FileInputStream(path+"/src/test/java/config/config.properties");
		     prop.load(input);
		     String browser=prop.getProperty("browser");
		     TestNgDemo.browsername=browser;
		     log.info("I am in this browser:"+browser);
		     
		} catch (Exception e) {
			log.error(e.getMessage());
			e.printStackTrace();
		}
		
	}
	//write to property file
	public static void setProperties() {
	try {
		
		OutputStream output =new FileOutputStream(path+"/src/test/java/config/config.properties");
	    prop.setProperty("browser","Chrome");
	    prop.store(output, "Hi");
	} catch (Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	}

}
