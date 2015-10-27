package testMediaDevice;

/**
 * Created by User on 20/10/2015.
 */
public class EntertainmentDeviceFactory extends DeviceFactory {

    // returns the entertainment device
    EntertainmentDevice getEntertainmentDevice(String entertainmentDevice) {
        if(entertainmentDevice.equals("music"))
            return new MusicPlayer();
        else if(entertainmentDevice.equals("video"))
            return new VideoPlayer();
        else
            return null;
    }

	@Override
	UtilityDevice getUtilityDevice(String utilityDevice) {
		// TODO Auto-generated method stub
		return null;
	}

}
