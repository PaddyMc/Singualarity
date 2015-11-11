package testMediaDevice;

public interface Command {
    String execute();

    void addInterceptor(Interceptor i);
}
