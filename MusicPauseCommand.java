package testMediaDevice;

public class MusicPauseCommand implements Command, Runnable {
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

    public void run() {
        String threading = execute();
        String threadingOutput = "ThreadRunning: " + threading;
        System.out.println(threadingOutput);
    }
}
