package testMediaDevice;

public class MusicPauseCommand implements Command {
    private EntertainmentDevice myMusicPlayer;
    private Interceptor intercept;

    public MusicPauseCommand(EntertainmentDevice mP) {
        myMusicPlayer = mP;
    }

    public String execute() {
        intercept.event();
        return myMusicPlayer.getName();

    }

    public void addInterceptor(Interceptor i) {
        this.intercept = i;
    }
}
