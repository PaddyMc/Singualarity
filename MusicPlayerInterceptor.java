package testMediaDevice;

import java.io.*;
import java.util.Date;

public class MusicPlayerInterceptor implements Interceptor {

    public void event() {
        BufferedWriter out;
        //String read;
        try {

            out = new BufferedWriter(new FileWriter("Project.txt"));

            Date date = new Date();
            //System.out.print(date.toString());


            out.write("Music Paused: " + date.toString());


            out.close();
        } catch (IOException e) {
            System.out.println("There was a problem:" + e);

        }
    }

    public void event_2() {
        // TODO Auto-generated method stub

    }

}
