package testMediaDevice;

<<<<<<< HEAD
public class MusicPauseCommand implements Command, Runnable {
=======
public class MusicPauseCommand implements Command,Runnable {
>>>>>>> origin/master
    private EntertainmentDevice myMusicPlayer;
    private Interceptor interceptor;

    public MusicPauseCommand(EntertainmentDevice mP) {
        myMusicPlayer = mP;
    }

    public String execute() {
        interceptor.event();
        return myMusicPlayer.getName();

    }

    public void addInterceptor(Interceptor i) {
        this.interceptor = i;
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
