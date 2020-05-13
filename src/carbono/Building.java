package carbono;

import java.io.Serializable;

public abstract class Building implements CarbonFootprint,Serializable{
	protected int numberPeoples;
	protected boolean useRenewableEnergy;
	protected int numberLamp;
	protected boolean useAirConditioning;
	
	public Building(int numberPeoples,boolean useRenewableEnergy,int numberLamp,boolean useAirConditioning) {
		this.numberLamp = numberLamp;
		this.numberPeoples = numberPeoples;
		this.useAirConditioning = useAirConditioning;
		this.useRenewableEnergy = useRenewableEnergy;
	}

	
	public float getCarbonFootprint() {
		float gas=0;
		if(useRenewableEnergy) {
			
		}else {
			gas = (float) (gas + (numberLamp*numberPeoples*1.25));
		}
		
		if(useAirConditioning) {
			gas = (float) (gas + (numberPeoples*1.15));
		}
		return gas;
	}
}
