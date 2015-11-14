package testMediaDevice;

public class VolumeDownCommand implements Runnable,Command {
    private AudioVolume audioVolume;
    Interceptor i;

    public VolumeDownCommand(AudioVolume audioVolume) {
        this.audioVolume = audioVolume;
    }

    public String execute() {
        audioVolume.setVolume(audioVolume.getVolume() - 1);
        String execution = "volume decreased";
        return execution;
    }

    public void addInterceptor(Interceptor i) {
        this.i = i;
    }

	@Override
	public void run() {
		String threading = execute();
		String threadingOutput =  "ThreadRunning: " + threading;
		System.out.println(threadingOutput);
	}
}

