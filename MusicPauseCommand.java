package testMediaDevice;

/**
 * Created by User on 20/10/2015.
 */
public class MusicPauseCommand implements Command {
    private EntertainmentDevice myMusicPlayer;

    public MusicPauseCommand(EntertainmentDevice mP){
        myMusicPlayer = mP;
    }
    public String execute() {
        return myMusicPlayer.getName();
    }
}
