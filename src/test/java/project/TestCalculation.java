package project;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculation {

	@Test
	public void testClose() {
		calculate close = new Close(1.0);
		Assert.assertEquals(1.0, close.calculation(), 1);
	}
	
	@Test
	public void testCreative() {
		calculate creative = new Creative(1.0);
		Assert.assertEquals(1.0, creative.calculation(), 1);
	}
	
	@Test
	public void testEvent() {
		calculate event = new Event(1.0);
		Assert.assertEquals(1.0, event.calculation(), 1);
	}
	
	@Test
	public void testGifts() {
		calculate gifts = new Gifts(1.0);
		Assert.assertEquals(1.0, gifts.calculation(), 1);
	}
	
	@Test
	public void testMarketing() {
		calculate marketing = new Marketing(1.0);
		Assert.assertEquals(1.0, marketing.calculation(), 1);
	}
	
	@Test
	public void testOverheadCosts() {
		calculate overheadCosts = new OverheadCosts(1.0, 1.0);
		Assert.assertEquals(1.0, overheadCosts.calculation(), 1);
	}
	
	@Test
	public void testService() {
		calculate service = new Service(2.0, 1.0, 1.0, 1.0, 1.0);
		Assert.assertEquals(1.0, service.calculation(), 1);
	}
	
	@Test
	public void testTechPreparation() {
		calculate techPreparation = new TechPreparation(1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0);
		Assert.assertEquals(1.0, techPreparation.calculation(), 1);	
	}

}
