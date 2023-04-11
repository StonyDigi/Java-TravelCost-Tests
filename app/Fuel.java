package app;

public class Fuel {
	
	private String type;
	private Double netPrice; //nett� �r
	private Double grossPrice; //brutt�, �f�val n�velt �ra
	private Double taxPercent; //�fa
	
	public Fuel(String type, Double netPrice, Double taxPercent) {
		
		this.type = type;
		this.netPrice = netPrice;
		this.taxPercent = taxPercent;
	}
	
	public String getType() {
		return type;
	}

	public Double getNetPrice() {
		return netPrice;
	}

	public Double getGrossPrice() {
		return grossPrice;
	}

	public Double getTaxPercent() {
		return taxPercent;
	}

	@Override
	public String toString() {
		return "Fuel [type=" + type + ", netPrice=" + netPrice + ", grossPrice=" + grossPrice + ", taxPercent="
				+ taxPercent + "]";
	}
	
	public Double setGrossPrice() {
		return this.grossPrice = (this.netPrice*this.taxPercent/100)+this.netPrice;
	}
}