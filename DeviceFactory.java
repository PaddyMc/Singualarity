package testMediaDevice;

public abstract class DeviceFactory {

    // method for EntertainmentDeviceFactory to implement
    abstract EntertainmentDevice getEntertainmentDevice(String entertainmentDevice);

    abstract UtilityDevice getUtilityDevice(String utilityDevice);

}
