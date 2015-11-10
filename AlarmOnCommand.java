package testMediaDevice;

public class AlarmOnCommand implements Command {
	private Alarm myAlarm;
	public AlarmOnCommand (Alarm a) {
		//create interceptor
		myAlarm = a;
	}
	public String execute() {
		//run interceptor
		String execution = myAlarm.armAlarm();
		return execution;
	}
	public void addInterceptor(Interceptor inter) {
		// TODO Auto-generated method stub
		
	}
	public Interceptor getInterceptor() {
		// TODO Auto-generated method stub
		return null;
	}
}
