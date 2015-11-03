package testMediaDevice;

public class Switch {

	private Command onCommand, offCommand;
	public Switch (Command on, Command off) {
		onCommand = on; // concrete Command registers itself with the invoker
		offCommand = off;
	}
	void turnOn() {	// invoker calls back concrete Command, which executes the Command on the receiver
		onCommand.execute();
	}
	void turnOff() {
		offCommand.execute();
	}
}
