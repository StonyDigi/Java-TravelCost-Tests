package app;

public class TravelRoute {
	
	private Double totalLenght;
	private Double motorWay;
	private Double highWay;
	private Double dirtRoad;
	private Double paymentLenght;
	
	

	public TravelRoute(Double totalLenght, Double motorWay, Double highWay, Double dirtRoad, Double paymentLenght) {
		
		this.totalLenght = totalLenght;
		this.motorWay = motorWay;
		this.highWay = highWay;
		this.dirtRoad = dirtRoad;
		this.paymentLenght = paymentLenght;
	}



	public Double getTotalLenght() {
		return totalLenght;
	}



	public Double getMotorWay() {
		return motorWay;
	}



	public Double getHighWay() {
		return highWay;
	}



	public Double getDirtRoad() {
		return dirtRoad;
	}



	public Double getPaymentLenght() {
		return paymentLenght;
	}

	@Override
	public String toString() {
		return "TravelRoute [totalLenght=" + totalLenght + ", motorWay=" + motorWay + ", highWay=" + highWay
				+ ", dirtRoad=" + dirtRoad + ", paymentLenght=" + paymentLenght + "]";
	}
}