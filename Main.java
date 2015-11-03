package testMediaDevice;

public class Main {

    public static void main(String[] args) {
	//Testing Facade
    	HomeLoginFacade accessHome = new HomeLoginFacade("Pitiful Human", 1234);
    	accessHome.loginToHome();

        MediaDeviceCommander mediaDeviceCommander = new MediaDeviceCommander();
        mediaDeviceCommander.synergize();

	//Testing Command Patterns - Alarm, Electricity & Music
    	Alarm testAlarm = new Alarm();
    	Command test = new AlarmOffCommand(testAlarm);
        System.out.println(test.execute());
        test = new AlarmOnCommand(testAlarm);
        System.out.println(test.execute());
        
        DeviceFactory utilityDeviceFactory = DeviceBuilder.getDevice("utility");
        UtilityDevice electricty = utilityDeviceFactory.getUtilityDevice("electricty");
        test = new UtilityStatusCommand(electricty);
        System.out.println(test.execute());

        DeviceFactory entertainmentDeviceFactory = DeviceBuilder.getDevice("entertainment");
        EntertainmentDevice musicPlayer = entertainmentDeviceFactory.getEntertainmentDevice("music");
        test = new MusicPauseCommand(musicPlayer);
        System.out.println(test.execute());
    }
}

