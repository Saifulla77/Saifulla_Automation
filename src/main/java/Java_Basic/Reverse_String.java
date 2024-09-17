package Java_Basic;

public class Reverse_String {

	public static void main(String[] args) {
		 
		String name    = "Saifulla";
		String result  =  "";
		
		int length  = name.length();
		for(int i=length-1; i>=0;i--)
		{
	    
	    result = result+name.charAt(i);
		
		}
		System.out.println("Reverse string is:"+result);

	}

}
