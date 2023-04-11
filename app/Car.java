package app;

public class Car {
		
		private String licenseNumber; //rendsz�m
		private Double consumption; //fogyaszt�s
		private Integer yearOfManufacture; //�vj�rat
		private Byte maxNumberOfPersonTransport; //sz�l.szem�lyek sz�ma
		private Byte actualNumberOfPersonTransport; //aktu�lisan h�ny embert sz�ll�t
		private Byte fuelCategory; //�zemanyagtipus
		
		public Car(String licenseNumber, Double consumption, Integer yearOfManufacture, Byte maxNumberOfPersonTransport,
				Byte actualNumberOfPersonTransport, Byte fuelCategory) {
			
			this.licenseNumber = licenseNumber;
			this.consumption = consumption;
			this.yearOfManufacture = yearOfManufacture;
			this.maxNumberOfPersonTransport = maxNumberOfPersonTransport;
			this.actualNumberOfPersonTransport = actualNumberOfPersonTransport;
			this.fuelCategory = fuelCategory;
		}

		public String getLicenseNumber() {
			return licenseNumber;
		}

		public Double getConsumption() {
			return consumption;
		}

		public Integer getYearOfManufacture() {
			return yearOfManufacture;
		}

		public Byte getMaxNumberOfPersonTransport() {
			return maxNumberOfPersonTransport;
		}

		public Byte getActualNumberOfPersonTransport() {
			return actualNumberOfPersonTransport;
		}

		public Byte getFuelCategory() {
			return fuelCategory;
		}

		@Override
		public String toString() {
			return "Car [licenseNumber=" + licenseNumber + ", consumption=" + consumption + ", yearOfManufacture="
					+ yearOfManufacture + ", maxNumberOfPersonTransport=" + maxNumberOfPersonTransport
					+ ", actualNumberOfPersonTransport=" + actualNumberOfPersonTransport + ", fuelCategory="
					+ fuelCategory + "]";
		}
		
		
		
		
		
	
}