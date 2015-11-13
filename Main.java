package testMediaDevice;

public class Main {

    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        MediaDeviceCommander mediaDeviceCommander = new MediaDeviceCommander();
        mediaDeviceCommander.synergize();

        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) );
    }
}

