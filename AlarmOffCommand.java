package testMediaDevice;

public class AlarmOffCommand  implements Command {
	private Alarm myAlarm;
	Interceptor i;
	public AlarmOffCommand (Alarm a) {
		myAlarm = a;
	}
	public String execute() {
		//i.event();
		String execution = myAlarm.disarmAlarm();
		return execution;
	}
	public void addInterceptor(Interceptor i) {
		this.i = i;
		
	}
	public Interceptor getInterceptor() {
		// TODO Auto-generated method stub
		return i;
	}
}
