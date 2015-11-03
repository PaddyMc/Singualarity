package testMediaDevice;

public class AlarmOffCommand  implements Command {
	private Alarm myAlarm;
	public AlarmOffCommand (Alarm a) {
		myAlarm = a;
	}
	public String execute() {
		String execution = myAlarm.disarmAlarm();
		return execution;
	}
}
