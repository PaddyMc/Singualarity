package testMediaDevice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class LogInterceptor implements Interceptor {

    public void event() {
        Date date = new Date();

        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Log.txt", true)))) {
            out.println("Item logged: " + date.toString());
        } catch (IOException e) {
            System.out.println("There was a problem:" + e);
        }
    }

    public void event_2() {
        // TODO Auto-generated method stub

    }

}
