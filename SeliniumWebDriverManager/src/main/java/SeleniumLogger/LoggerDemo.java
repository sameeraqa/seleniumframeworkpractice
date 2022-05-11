package SeleniumLogger;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LoggerDemo {

	public static void main(String[] args) {
		
		Logger log=LogManager.getLogger(LoggerDemo.class);
		System.out.println("Inside logging");
		log.info("log infotrmation message");
		log.error("log error message");
		log.fatal("log fatal medssage");
		log.warn("log warn message");
		System.out.println("Completed");

	}

}
