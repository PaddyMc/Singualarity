package testMediaDevice;

public class MusicPlayer implements EntertainmentDevice {
    Command musicCommand;

    //Interceptor i;
    // returns music device name
    public String getName() {
        return "MusicPlayer name";
    }

    // returns music device status
    public String getStatus() {
        return "MusicPlayer status";
    }

    public void setCommand(Command musicStop) {
        this.musicCommand = musicStop;
    }
}
