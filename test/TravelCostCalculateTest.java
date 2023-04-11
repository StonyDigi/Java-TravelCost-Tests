package test;

import org.junit.Assert;
import org.junit.Test;

import app.TravelCostCalculate;


public class TravelCostCalculateTest {
	
	@Test
	public void getTravelCostTest() {
		Double carConsumption = 5.0;
		Double totalRouteLenght = 800.0;
		Double grossFuelPrice = 445.008;
		
		TravelCostCalculate tccObj = new TravelCostCalculate();
		Double actual = tccObj.getTravelCost(totalRouteLenght, grossFuelPrice, carConsumption);
		Double expected = 17800.32;
		Assert.assertEquals(expected, actual);
	}
}