
public class ImplementInterface implements InterfaceDemo,InterfaceDemo2{

	
	
	
	public static void main(String[] args) {
		System.out.println("Default methods from two interfaces");
		
	}

	@Override
	public long getLong() {
		System.out.println("My Code overriden default method");
		return 0;
	}

	@Override
	public int Hello() {
		// TODO Auto-generated method stub
		return InterfaceDemo2.super.Hello();
	}

}
