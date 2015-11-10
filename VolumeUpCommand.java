package testMediaDevice;

/**
 * Created by User on 10/11/2015.
 */
public class VolumeUpCommand implements Command {
    private AudioVolume entertainmentDevice;

    public VolumeUpCommand (AudioVolume entertainmentDevice) {
        this.entertainmentDevice = entertainmentDevice;
    }

    public String execute() {
        entertainmentDevice.setVolume(+1);
        String execution = "volume increased";
        return execution;
    }

	public void addInterceptor(Interceptor i) {
		// TODO Auto-generated method stub
		
	}

	public Interceptor getInterceptor() {
		// TODO Auto-generated method stub
		return null;
	}
}
