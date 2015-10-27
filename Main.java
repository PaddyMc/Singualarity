package testMediaDevice;

public class Main {

    public static void main(String[] args) {

        // Factory to create entertainment devices
        DeviceFactory entertainmentDeviceFactory = DeviceBuilder.getDevice("entertainment");
        
        // Utilities
        DeviceFactory utilityDeviceFactory = DeviceBuilder.getDevice("utility");
        
        UtilityDevice electricty = utilityDeviceFactory.getUtilityDevice("electricty");
        System.out.println(electricty.getName());
        

        // entertainmentDeviceFactory creates music player device
        EntertainmentDevice musicPlayer = entertainmentDeviceFactory.getEntertainmentDevice("music");
        //System.out.println(musicPlayer.getName());
        //System.out.println(musicPlayer.getStatus());

        Command mp = new MusicPauseCommand(musicPlayer);
        System.out.println(mp.execute());
        
        Command electrictyStatusCommand = new UtilityStatusCommand(electricty);
        System.out.println(electrictyStatusCommand.execute());


                // entertainmentDeviceFactory creates music video device
        EntertainmentDevice videoPlayer = entertainmentDeviceFactory.getEntertainmentDevice("video");
        System.out.println(videoPlayer.getName());
        //System.out.println(videoPlayer.getStatus());


    }
}

