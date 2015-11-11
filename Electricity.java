package testMediaDevice;

public class Electricity implements UtilityDevice {

    public String getName() {
        String name = "Electricity";
        return name;
    }

    public String getStatus() {
        String status = "Electricity is active";
        return status;
    }

}
