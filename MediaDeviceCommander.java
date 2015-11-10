package testMediaDevice;

public class MediaDeviceCommander {

    MediaDeviceCommander() {
        System.out.println("You have reached singularity");
    }

    void synergize(){

		//Testing Facade
    	HomeLoginFacade accessHome = new HomeLoginFacade("Pitiful Human", 1234);
    	accessHome.loginToHome();
        
	    //Testing Command Patterns - Alarm, Electricity & Music
    	Alarm testAlarm = new Alarm();
    	Command test = new AlarmOffCommand(testAlarm);
        

		
        // Factorys to create entertainment + Utility devices
        DeviceFactory entertainmentDeviceFactory = DeviceBuilder.getDevice("entertainment");
        DeviceFactory utilityDeviceFactory = DeviceBuilder.getDevice("utility");
        
        EntertainmentDevice videoPlayer = entertainmentDeviceFactory.getEntertainmentDevice("video");
        EntertainmentDevice musicPlayer = entertainmentDeviceFactory.getEntertainmentDevice("music"); 
        UtilityDevice electricity = utilityDeviceFactory.getUtilityDevice("electricity");
        electricity = new Temperature(electricity, 25);
               
        Command mp = new MusicPauseCommand(musicPlayer);
        
        Dispatcher d = new Dispatcher();        
        MusicPlayerInterceptor inter = new MusicPlayerInterceptor();        
        mp.addInterceptor(inter);
        d.register(inter);   
        mp.execute();
        
        

        Command electrictyStatusCommand = new UtilityStatusCommand(electricity);
        
        AudioVolume videoPlayer1 = new AudioVolume(videoPlayer);
        Command volumeDown = new VolumeDownCommand(videoPlayer1);
        volumeDown.execute();
		
		
    }
}
