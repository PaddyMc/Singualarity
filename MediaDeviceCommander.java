package testMediaDevice;

public class MediaDeviceCommander {

    MediaDeviceCommander() {
        String message;
        message = "Your device has been activated.\nYou have reached singularity.\n";
        System.out.println(message);
    }

    void runCommanderCLI() {
        String input;
        boolean resume = true;

        while (resume) {
            input = CommanderCLI.getInput();

            if (input.equals("synergize")) {
                synergize();
            } else if (input.equals("logout")) {
                resume = false;
            }
        }

        System.out.println("You are logging out.\nGoodbye :)");
    }

    void synergize() {
        // Creating factories
        DeviceFactory entertainmentDeviceFactory = DeviceBuilder.getDevice("entertainment");
        DeviceFactory utilityDeviceFactory = DeviceBuilder.getDevice("utility");

        // Creating dispatcher
        Dispatcher d = new Dispatcher();

        // Creating devices
        EntertainmentDevice videoPlayer = entertainmentDeviceFactory.getEntertainmentDevice("video");
        EntertainmentDevice musicPlayer = entertainmentDeviceFactory.getEntertainmentDevice("music");
        UtilityDevice electricity = utilityDeviceFactory.getUtilityDevice("electricity");
        UtilityDevice water = utilityDeviceFactory.getUtilityDevice("water");

        // Creating decorators
        electricity = new Temperature(electricity, 25);
        water = new Temperature(water, 15);
        AudioVolume videoPlayerAudio = new AudioVolume(videoPlayer);
        musicPlayer = new AudioVolume(musicPlayer);

        // Creating commands
        Command electricityStatusCommand = new UtilityStatusCommand(electricity);
        Command waterStatusCommand = new UtilityStatusCommand(water);
        Command mpPauseCommand = new MusicPauseCommand(musicPlayer);
        Command volumeDownCommand = new VolumeDownCommand(videoPlayerAudio);

        // Concurrency Threads
        Thread runVolumeDown = new Thread((Runnable) volumeDownCommand);
        Thread runPause = new Thread((Runnable) mpPauseCommand);
        Thread runElectricityStatus = new Thread((Runnable) electricityStatusCommand);

        // Creating and registering interceptors
        Interceptor musicPlayerInterceptor = new MusicPlayerInterceptor();
        d.register(musicPlayerInterceptor);
        Interceptor logInterceptor = new LogInterceptor();
        d.register(musicPlayerInterceptor);

        // Adding interceptors to commands
        mpPauseCommand.addInterceptor(musicPlayerInterceptor);
        electricityStatusCommand.addInterceptor(logInterceptor);
        waterStatusCommand.addInterceptor(logInterceptor);
        volumeDownCommand.addInterceptor(logInterceptor);

        // Execute some tasks
        //mpPauseCommand.execute();
        //electricityStatusCommand.execute();
        waterStatusCommand.execute();
        //volumeDownCommand.execute();

        // Threads running
        runVolumeDown.start();
        runPause.start();
        runElectricityStatus.start();

        System.out.println("Music Player name: " + musicPlayer.getName());
        System.out.println("Video Player name: " + videoPlayer.getName());
        System.out.println("Water name: " + water.getName());
        System.out.println("Electricity name: " + electricity.getName());
        System.out.println("Video Player volume: " + videoPlayerAudio.getVolume());


        // Testing Command Patterns - Alarm, Electricity & Music
        Alarm alarm = new Alarm();
        Command test = new AlarmOffCommand(alarm);
        String testAlarm = test.execute();
        System.out.println(testAlarm);
    }
}
