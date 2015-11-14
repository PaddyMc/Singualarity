package testMediaDevice;

public abstract class DeviceFactory {
    abstract EntertainmentDevice getEntertainmentDevice(String entertainmentDevice);

    abstract UtilityDevice getUtilityDevice(String utilityDevice);
}
