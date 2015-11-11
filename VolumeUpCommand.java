package testMediaDevice;

public class VolumeUpCommand implements Command {
    private AudioVolume audioVolume;
    private Interceptor i;

    public VolumeUpCommand(AudioVolume entertainmentDevice) {
        this.audioVolume = entertainmentDevice;
    }

    public String execute() {
        audioVolume.setVolume(audioVolume.getVolume() + 1);
        String execution = "volume increased";
        return execution;
    }

    public void addInterceptor(Interceptor i) {
        this.i = i;
    }
}
