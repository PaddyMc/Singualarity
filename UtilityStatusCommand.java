package testMediaDevice;

public class UtilityStatusCommand implements Command, Runnable {

    UtilityDevice util;
    Interceptor i;

    public UtilityStatusCommand(UtilityDevice utilityDevice) {
        this.util = utilityDevice;
    }

    public String execute() {
        i.event();
        return this.util.getStatus();
    }

    public void addInterceptor(Interceptor i) {
        this.i = i;
    }

    @Override
    public void run() {
        String threading = execute();
        String threadingOutput = "ThreadRunning: " + threading;
        System.out.print(threadingOutput);

    }
}
