package carbono;

import java.io.Serializable;

public class School extends Building implements CarbonFootprint,Serializable{

	public School(int numberPeoples, boolean useRenewableEnergy, int numberLamp, boolean useAirConditioning) {
		super(numberPeoples, useRenewableEnergy, numberLamp, useAirConditioning);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public float getCarbonFootprint() {
		float gas=0;
		if(useRenewableEnergy) {
			
		}else {
			gas = (float) (gas + (numberLamp*numberPeoples*1.48));
		}
		
		if(useAirConditioning) {
			gas = (float) (gas + (numberPeoples*1.64));
		}
		return gas;
		
	}
}
