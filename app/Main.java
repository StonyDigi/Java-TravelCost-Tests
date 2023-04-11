package app;

public class Main {
	
	public static void main(String[] args) {
		Byte maxNumberOfPersonTransport = 5;
		Byte actualNumberOfPersonTransport = 3;
		Byte fuelCategory = 1;
		
		Car carObj = new Car(
				"GDE-751",
				5.0,
				1996,
				maxNumberOfPersonTransport, actualNumberOfPersonTransport, fuelCategory);
		
		TravelRoute trObj = new TravelRoute(800.0, 600.0, 180.0, 20.0, 400.0);

		Fuel fObj = new Fuel("benzin", 350.4, 27.0);
		fObj.setGrossPrice();
		System.out.println("Bruttó ár: " + fObj.getGrossPrice());
		
		TravelCostCalculate tccObj = new TravelCostCalculate();
		System.out.println(tccObj.getTravelCost(trObj.getTotalLenght(), fObj.getGrossPrice(), carObj.getConsumption()));
		
		
	}
}