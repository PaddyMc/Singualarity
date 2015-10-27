package testMediaDevice;

public class DeviceBuilder {

    // returns device factory
    public static DeviceFactory getDevice(String device){
        if(device.equals("entertainment")){
            return new EntertainmentDeviceFactory();
        }
        else if(device.equals("utility")){
        	return new UtilityDeviceFactory();        	
        }
        else
            return null;
    }
}