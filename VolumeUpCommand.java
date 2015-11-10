package testMediaDevice;

/**
 * Created by User on 10/11/2015.
 */
public class VolumeUpCommand {
    private AudioVolume entertainmentDevice;

    public VolumeUpCommand (AudioVolume entertainmentDevice) {
        this.entertainmentDevice = entertainmentDevice;
    }

    public String execute() {
        entertainmentDevice.setVolume(+1);
        String execution = "volume increased";
        return execution;
    }
}
