package testMediaDevice;

public class PINCheck {

	private int pincode = 1234;
	public int getPINCode() { return pincode; }
	
	public boolean pinCorrect (int pinToCheck) {
		if (pinToCheck == getPINCode()) {
			return true;
		} else {
			return false;
		}
	}
}
