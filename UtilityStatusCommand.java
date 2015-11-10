package testMediaDevice;

public class UtilityStatusCommand implements Command{

	UtilityDevice util;
	public UtilityStatusCommand(UtilityDevice utilityDevice)
	{
		this.util = utilityDevice;
	}

	public String execute() {
		return this.util.getStatus();
	}

	public void addInterceptor(Interceptor i) {
		// TODO Auto-generated method stub
		
	}

	public Interceptor getInterceptor() {
		// TODO Auto-generated method stub
		return null;
	}

}
