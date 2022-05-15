package project;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PercentInputTest {

	@Test
	public void LessThanZeroExceptiontest() {
		lineInput LessThanZero = new PercentInput("-12");
		try {
			LessThanZero.checkinput();
			Assert.fail();
		}catch(Exception e) {
			Assert.assertEquals(LessThanZeroException.class , e.getClass());
		}
	}

	@Test
	public void PercentExceptiontest() {
		lineInput Percent = new PercentInput("101");
		try {
			Percent.checkinput();
			Assert.fail();
		}catch(Exception e) {
			Assert.assertEquals(PercentException.class , e.getClass());
		}
	}

	@Test
	public void WholeNumberExceptiontest() {
		lineInput WholeNumber = new PercentInput("1.5");
		try {
			WholeNumber.checkinput();
			Assert.fail();
		}catch(Exception e) {
			Assert.assertEquals(WholeNumberException.class , e.getClass());
		}
	}

}
