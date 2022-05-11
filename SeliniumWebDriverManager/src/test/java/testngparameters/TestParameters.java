package testngparameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {
	
	
    @Test
    @Parameters({"MyName"})
	public void test(@Optional("Sameera") String name) {
		System.out.println("Name is:"+name);
	}

}
