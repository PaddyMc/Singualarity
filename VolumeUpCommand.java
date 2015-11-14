package testMediaDevice;

<<<<<<< HEAD
public class VolumeUpCommand implements Command, Runnable {
=======
public class VolumeUpCommand implements Command,Runnable {
>>>>>>> origin/master
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
<<<<<<< HEAD

    public void run() {
        String threading = execute();
        String threadingOutput = "ThreadRunning: " + threading;
        System.out.println(threadingOutput);
    }
=======
	public void run() {
		String threading = execute();
		String threadingOutput =  "ThreadRunning: " + threading;
		System.out.println(threadingOutput);
	}
>>>>>>> origin/master
}
