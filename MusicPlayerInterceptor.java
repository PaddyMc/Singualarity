package testMediaDevice;

import java.io.*;
import java.util.Date;

public class MusicPlayerInterceptor implements Interceptor {

    public void event() {
        Date date = new Date();

        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("MusicPauseLog.txt", true)))) {
            out.println("Music paused: " + date.toString());
        }catch (IOException e) {
            System.out.println("There was a problem:" + e);
        }
    }

    public void event_2() {
        // TODO Auto-generated method stub

    }

}
