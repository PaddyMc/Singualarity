package testMediaDevice;

public class Alarm implements EntertainmentDevice {
	public String armAlarm() {
		return ("Alarm is armed");
	}
	public String disarmAlarm() {
		return ("Alarm has been disarmed");
	}
	@Override
	public String getName() {
		String name ="Alarm";
		return name;
	}
	@Override
	public String getStatus() {
		String status = "On";
		return status;
	}
}
