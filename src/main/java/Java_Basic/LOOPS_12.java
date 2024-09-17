package Java_Basic;

public class LOOPS_12 {


	public static void main(String[] args) {
		while_loop();
		Do_while_loop();
		
		
		
		//For_Loop
		for(int i=1; i<=15; i++)
		
		{
		System.out.println(i);
		
		}

	}
	

	private static void Do_while_loop() {
		//Do_While_Loop
		
		int i=1;
		do {
			System.out.println("Do while loop"+i);
			i++;
		}while(i<11);
		
	//While is one Of the loop that is used to run piece  of program Repeatedly until the specified Condition is True.	
			
	}


	private static void while_loop() {
	
		//while_Loop
		
		int i=1;
		while(i<=14)
		{
			System.out.println(i);
			i++;
		}
	}

}
      //In do_while loop the code will be executed atleast once.
     //The Code will be executed at least once, why because here we are checking the condition later.