package testMediaDevice;

public class UtilityDeviceFactory extends DeviceFactory {

	@Override
	EntertainmentDevice getEntertainmentDevice(String entertainmentDevice) {
		// TODO Auto-generated method stub
		return null;
	}
	
	UtilityDevice getUtilityDevice(String utilityDevice){
		if(utilityDevice.equals("water"))
		{
            return new Water();
		}
        else if(utilityDevice.equals("electricty"))
        {
            return new Electricty();
        }
        else
        {
            return null;
        }
	}
	


}
