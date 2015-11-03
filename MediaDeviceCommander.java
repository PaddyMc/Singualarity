package testMediaDevice;

/**
 * Created by User on 03/11/2015.
 */
public class MediaDeviceCommander {

    MediaDeviceCommander() {
        System.out.println("You have reached singularity");
    }

    void synergize(){
        // Factory to create entertainment devices
        DeviceFactory entertainmentDeviceFactory = DeviceBuilder.getDevice("entertainment");

        // Utilities
        DeviceFactory utilityDeviceFactory = DeviceBuilder.getDevice("utility");

        UtilityDevice electricity = utilityDeviceFactory.getUtilityDevice("electricity");
        System.out.println(electricity.getName());
        electricity = new Temperature(electricity, 25);



        // entertainmentDeviceFactory creates music player device
        EntertainmentDevice musicPlayer = entertainmentDeviceFactory.getEntertainmentDevice("music");
        //System.out.println(musicPlayer.getName());
        //System.out.println(musicPlayer.getStatus());

        Command mp = new MusicPauseCommand(musicPlayer);
        System.out.println(mp.execute());

        Command electrictyStatusCommand = new UtilityStatusCommand(electricity);
        System.out.println(electrictyStatusCommand.execute());


        // entertainmentDeviceFactory creates music video device
        EntertainmentDevice videoPlayer = entertainmentDeviceFactory.getEntertainmentDevice("video");
        System.out.println(videoPlayer.getName());
        //System.out.println(videoPlayer.getStatus());
    }
}
