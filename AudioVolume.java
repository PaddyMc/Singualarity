package testMediaDevice;

public class AudioVolume extends EntertainmentDeviceDecorator {

    private int volume;

    public AudioVolume(EntertainmentDevice entertainmentDevice) {
        super(entertainmentDevice);

        //System.out.println("Adding volume setting to Entertainment Device");

        // Default value for volume
        volume = 20;
    }

    public String getName() {
        return entertainmentDevice.getName();
    }

    public String getStatus() {
        String status = entertainmentDevice.getStatus() + " volume: " + Integer.toString(volume);

        return status;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
