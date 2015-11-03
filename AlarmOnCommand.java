package testMediaDevice;

public class AlarmOnCommand  implements Command {
	private Alarm myAlarm;
	public AlarmOnCommand (Alarm a) {
		myAlarm = a;
	}
	public String execute() {
		String execution = myAlarm.armAlarm();
		return execution;
	}
}
