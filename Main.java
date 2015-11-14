package testMediaDevice;

public class Main {

    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        MediaDeviceCommander mediaDeviceCommander = new MediaDeviceCommander();

        boolean loggedIn = false;
        WelcomeHome welcomeHome;
        // Testing Facade
        while (!loggedIn) {
            HomeLoginFacade accessHome = new HomeLoginFacade();
            loggedIn = accessHome.loginToHome();

            if (loggedIn) {
                welcomeHome = new WelcomeHome();
                mediaDeviceCommander.runCommanderCLI();
            } else {
                System.out.println("You have entered incorrect details try again.\n");
            }
        }

        final long endTime = System.currentTimeMillis();
        //System.out.println("Total execution time: " + (endTime - startTime));
    }
}

