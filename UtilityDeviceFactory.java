package testMediaDevice;

public class UtilityDeviceFactory extends DeviceFactory {

    @Override
    EntertainmentDevice getEntertainmentDevice(String entertainmentDevice) {
        return null;
    }

    UtilityDevice getUtilityDevice(String utilityDevice) {
        if (utilityDevice.equals("water")) {
            return new Water();
        } else if (utilityDevice.equals("electricity")) {
            return new Electricity();
        } else {
            return null;
        }
    }


}
