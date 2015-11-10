package testMediaDevice;

/**
 * Created by User on 10/11/2015.
 */
public class VolumeDownCommand implements Command{
    private AudioVolume entertainmentDevice;

    public VolumeDownCommand (AudioVolume entertainmentDevice) {
        this.entertainmentDevice = entertainmentDevice;
    }

    public String execute() {
        entertainmentDevice.setVolume(-1);
        String execution = "volume decreased";
        return execution;
    }
}

