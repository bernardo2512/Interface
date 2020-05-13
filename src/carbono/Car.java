package carbono;

import java.io.Serializable;

public class Car implements CarbonFootprint,Serializable{
	private String fuel;
	private float displacement;
	
	public Car(String fuel, float displacement) {
		this.fuel = fuel;
		this.displacement = displacement;
	}

	@Override
	public float getCarbonFootprint() {
		float result = (float) (displacement * 0.218);
		return result;
	}

}
