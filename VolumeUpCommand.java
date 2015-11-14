package testMediaDevice;

public class VolumeUpCommand implements Command,Runnable {
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
	public void run() {
		String threading = execute();
		String threadingOutput =  "ThreadRunning: " + threading;
		System.out.println(threadingOutput);
	}
}
