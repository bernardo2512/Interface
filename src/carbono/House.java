package carbono;

import java.io.Serializable;

public class House extends Building implements CarbonFootprint ,Serializable{

	public House(int numberPeoples, boolean useRenewableEnergy, int numberLamp, boolean useAirConditioning) {
		super(numberPeoples, useRenewableEnergy, numberLamp, useAirConditioning);
		
	}

	@Override
	public float getCarbonFootprint() {
		float gas=0;
		if(useRenewableEnergy) {
			
		}else {
			gas = (float) (gas + (numberLamp*numberPeoples*1.35));
		}
		
		if(useAirConditioning) {
			gas = (float) (gas + (numberPeoples*1.28));
		}
		return gas;
		
	}
	
	
}
