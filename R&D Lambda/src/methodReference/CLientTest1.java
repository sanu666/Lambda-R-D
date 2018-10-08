package methodReference;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CLientTest1 {

	public static void main(String[] args){
		ExecutorService executorService=Executors.newSingleThreadExecutor();
		
		//Runnable command = ()->System.out.println("My task is running");
		
		//method reference to a static method
		Runnable command=CLientTest1::myRun;
		executorService.execute(command);
		
	}
	
	private static void myRun()
	{
		System.out.println("My task is running");
	}
}