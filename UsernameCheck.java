package testMediaDevice;

public class UsernameCheck {
	private String username = "Pitiful Human";
	public String getUsername() { 
		return username; 
		}
	public boolean usernameActive( String usernameToCheck) {
		if (usernameToCheck.matches(getUsername())) {
			return true;
		} else {
			return false;
		}
	}
}
