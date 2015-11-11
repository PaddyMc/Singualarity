package testMediaDevice;

abstract class EntertainmentDeviceDecorator implements EntertainmentDevice {
    protected EntertainmentDevice entertainmentDevice;

    public EntertainmentDeviceDecorator(EntertainmentDevice entertainmentDevice) {
        this.entertainmentDevice = entertainmentDevice;
    }

    public String getName() {
        return entertainmentDevice.getName();
    }

    public String getStatus() {
        return entertainmentDevice.getStatus();
    }


}
