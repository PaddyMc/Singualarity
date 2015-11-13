package testMediaDevice;

public class MusicPauseCommand implements Command {
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
}
