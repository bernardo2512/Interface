package carbono;

import java.io.Serializable;

public class Bicycle implements CarbonFootprint,Serializable{
	private String type;
	private float price;
	
	public Bicycle(String type, float price) {
		this.type = type;
		this.price = price;
		
	}

	@Override
	public float getCarbonFootprint() {
		return 0;
	}
}
