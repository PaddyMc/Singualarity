package testMediaDevice;

public class Temperature extends UtilityDeviceDecorator{
	protected int temp;

	public Temperature(UtilityDevice utilityDevice, int temperature) {
		super(utilityDevice);
		temp = temperature;
		
		System.out.print("Adding temperature setting to Utility");
	}

	public String getName() {
		return u.getName();
	}

	public String getStatus() {		
		return u.getStatus() + Integer.toString(temp);
	}

}
