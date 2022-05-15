package project;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class WholeNumberInputTest {

	@Test
	public void test() {
		lineInput number = new WholeNumberInput("4.7");
		try {
			number.checkinput();
			Assert.fail();
		}catch(Exception e) {
			Assert.assertEquals(WholeNumberException.class , e.getClass());
		}
	}

}
