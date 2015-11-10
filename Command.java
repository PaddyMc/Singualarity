package testMediaDevice;

public interface Command {
    public abstract String execute();
    public abstract void addInterceptor(Interceptor i);
    //public abstract Interceptor getInterceptor();

	//public abstract void addInterceptor(Interceptor inter);
}
