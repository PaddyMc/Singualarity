package testMediaDevice;

//Decouples client frm all sub components
//Simplifies the interface
public class HomeLoginFacade {

	private String username;
	private int pincode;
	
	UsernameCheck usernameChecker;
	PINCheck pinChecker;
	
	WelcomeHome homeWelcome;
	
	public HomeLoginFacade (String newUsername, int newPin) {
		username = newUsername;
		pincode = newPin;
		homeWelcome = new WelcomeHome();
		usernameChecker = new UsernameCheck();
		pinChecker = new PINCheck();
	}
	
	public String getUsername() { return username; }
	public int getPinNumber() { return pincode; }
	
	public void loginToHome() {
		if (usernameChecker.usernameActive(getUsername()) &&
				pinChecker.pinCorrect(getPinNumber())) {
			System.out.println("Login Accepted\n");
		} else {
			System.out.println("Login Failed\n");
		}
	}
}
