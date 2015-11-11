package testMediaDevice;

public class AlarmOnCommand implements Command {

    private Alarm myAlarm;
    Interceptor i;

    public AlarmOnCommand(Alarm a) {
        //create interceptor
        myAlarm = a;
    }

    public String execute() {
        //run interceptor
        String execution = myAlarm.armAlarm();
        return execution;
    }

    public void addInterceptor(Interceptor i) {
        this.i = i;
    }
}
