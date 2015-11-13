package testMediaDevice;

public class EntertainmentDeviceFactory extends DeviceFactory {

    // returns the entertainment device
    EntertainmentDevice getEntertainmentDevice(String entertainmentDevice) {
        if (entertainmentDevice.equals("music"))
            return new MusicPlayer();
        else if (entertainmentDevice.equals("video"))
            return new VideoPlayer();
        else if (entertainmentDevice.equals("alarm"))
            return new Alarm();
        else
            return null;
    }

    @Override
    UtilityDevice getUtilityDevice(String utilityDevice) {
        return null;
    }
}
