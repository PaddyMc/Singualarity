package testMediaDevice;

/**
 * Created by User on 10/11/2015.
 */
public class AudioVolume extends EntertainmentDeviceDecorator{
    // Default value for volume
    protected int volume = 20;

    public AudioVolume(EntertainmentDevice entertainmentDevice) {
        super(entertainmentDevice);

        System.out.println("Adding volume setting to Entertainment Device");
    }

    public String getName() {
        return entertainmentDevice.getName();
    }

    public String getStatus() {
        return entertainmentDevice.getStatus() + " volume: " + Integer.toString(volume);
    }

    public void setVolume(int volume){
        this.volume += volume;
    }

    public int getVolume(){
        return volume;
    }
}
