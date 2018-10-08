package lambdasBasic;

public class ImpementLambda {
	
	public static void main(String[] args) {
		SanuPersonalInterface sanu=(Sanu)->{System.out.println("Lambda reached");
		return Sanu;
		};
		System.out.println(sanu.printStuff("Hello"));
	}

}
