package testMediaDevice;

//Decouples client from all sub components
//Simplifies the interface
public class HomeLoginFacade {

    private String username;
    private int pincode;

    UsernameCheck usernameChecker;
    PINCheck pinChecker;

    LoginChecking loginChecking;

    public HomeLoginFacade() {
        username = LoginCLI.requestUserName();
        pincode = LoginCLI.requestPassword();
        usernameChecker = new UsernameCheck();
        pinChecker = new PINCheck();

        loginChecking = new LoginChecking();
    }

    public HomeLoginFacade(String newUsername, int newPin) {
        username = newUsername;
        pincode = newPin;
        loginChecking = new LoginChecking();
        usernameChecker = new UsernameCheck();
        pinChecker = new PINCheck();
    }

    public String getUsername() {
        return username;
    }

    public int getPinNumber() {
        return pincode;
    }

    public boolean loginToHome() {
        if (usernameChecker.usernameActive(getUsername()) &&
                pinChecker.pinCorrect(getPinNumber())) {
            return true;
        } else {
            return false;
        }
    }
}
