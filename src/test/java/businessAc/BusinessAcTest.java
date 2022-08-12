package businessAc;

import org.testng.annotations.Test;

import base.BaseClass;


public class BusinessAcTest extends BaseClass {
	
	@Test
	public void businessTest() {
		businessAc.businessAcSteps("Rayhan", "Chowdhury", "123-45-6789", "09/01/1999","Bangladesh", "42 alice ave", "buffalo", "NY", "14215");
		
		
		
	}
	
	

}
