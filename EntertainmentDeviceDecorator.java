package testMediaDevice;

abstract class EntertainmentDeviceDecorator implements EntertainmentDevice  {
	protected EntertainmentDevice e;
	
	public EntertainmentDeviceDecorator(EntertainmentDevice entertainmentDevice)
	{
		e = entertainmentDevice;
	}
	public String getName() {
		return e.getName();
	}

	public String getStatus() {		
		return e.getStatus();
	}



}
