
public interface InterfaceDemo {
	
	int a=5;
	long getLong();
	static int Hello1()
	{
		return 5;
	}
	default int Hello()
	{
		return 8;
	}
}
