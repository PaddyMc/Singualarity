package testMediaDevice;

/**
 * Created by User on 20/10/2015.
 */
public abstract class DeviceFactory {

    // method for EntertainmentDeviceFactory to implement
    abstract EntertainmentDevice getEntertainmentDevice(String entertainmentDevice);
    
    abstract UtilityDevice getUtilityDevice(String utilityDevice);

}
