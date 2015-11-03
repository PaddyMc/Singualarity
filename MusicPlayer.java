package testMediaDevice;

/**
 * Created by User on 20/10/2015.
 */
public class MusicPlayer implements EntertainmentDevice {
    Command musicCommand;
    // returns music device name
    public String getName() {
        return "MusicPlayer name";
    }

    // returns music device status
    public String getStatus() {
        return "MusicPlayer status";
    }
    
    public void setCommand(Command musicStop)
    {
    	this.musicCommand = musicStop; 
    }

    public void consumeService(){

    }
}
