package app;

public class TravelCostCalculate {
	
	public Double getTravelCost(Double totalRouteLength, Double grossFuelPrice, Double carConsumption) {
			Double result = 0.0;
			return result = (carConsumption/100)*totalRouteLength*grossFuelPrice;
	}
}
