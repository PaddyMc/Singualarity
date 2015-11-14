package testMediaDevice;

<<<<<<< HEAD
public class VolumeDownCommand implements Runnable, Command {
=======
public class VolumeDownCommand implements Runnable,Command {
>>>>>>> origin/master
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

<<<<<<< HEAD
    @Override
    public void run() {
        String threading = execute();
        String threadingOutput = "ThreadRunning: " + threading;
        System.out.println(threadingOutput);
    }
=======
	@Override
	public void run() {
		String threading = execute();
		String threadingOutput =  "ThreadRunning: " + threading;
		System.out.println(threadingOutput);
	}
>>>>>>> origin/master
}

