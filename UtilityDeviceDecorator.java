package testMediaDevice;

abstract class UtilityDeviceDecorator implements UtilityDevice {
    protected UtilityDevice u;

    public UtilityDeviceDecorator(UtilityDevice utilityDevice) {
        u = utilityDevice;
    }

    public String getName() {
        return u.getName();
    }

    public String getStatus() {
        return u.getStatus();
    }


}

