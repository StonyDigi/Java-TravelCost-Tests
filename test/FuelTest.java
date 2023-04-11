package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import app.Fuel;


public class FuelTest {
	
	@Test
	public void setGrossPriceTest() {
		Double netPrice = 100.0;
		Double taxPercent = 27.0;
		Fuel fObj = new Fuel("benzin", netPrice, taxPercent);
		fObj.setGrossPrice();
		Double actual = fObj.getGrossPrice();
		Double expected = 127.0;
		Assert.assertEquals(expected, actual);
	}
}
