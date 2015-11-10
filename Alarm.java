package testMediaDevice;

public class Alarm implements EntertainmentDevice {
	public String armAlarm() {
		return ("Alarm is armed");
	}
	public String disarmAlarm() {
		return ("Alarm has been disarmed");
	}
	public String getName() {
		String name ="Alarm";
		return name;
	}
	public String getStatus() {
		String status = "On";
		return status;
	}
}
