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

}
