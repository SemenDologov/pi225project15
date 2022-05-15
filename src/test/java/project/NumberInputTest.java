package project;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class NumberInputTest {

	@Test
	public void testcheckinput() {
		lineInput number = new NumberInput("-1");
		try {
			number.checkinput();
			Assert.fail();
		}catch(Exception e) {
			Assert.assertEquals(LessThanZeroException.class , e.getClass());
		}
	} 

	@Test
	public void testcheckinput1() {
		lineInput number = new NumberInput("0.001");
		try {
			number.checkinput();
			Assert.fail();
		}catch(Exception e) {
			Assert.assertEquals(MoneyInputException.class , e.getClass());
		}
	} 
		
		
		
		
	
	

}
