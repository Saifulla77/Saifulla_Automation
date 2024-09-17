package Java_Basic;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int n = 10;  
        int num1 = 0, num2 = 1;

        System.out.print("Fibonacci Series: " + num1 + ", " + num2);

        for (int i = 2; i < n; i++) {
            int nextNum = num1 + num2;
            System.out.print(", " + nextNum);
            num1 = num2;
            num2 = nextNum;
        }

	}

}
   //Fibonacci Series: A sequence of numbers where each number is the sum of the two numbers before it.
    
   //The first two numbers in the Fibonacci series are always 0 and 1. So, we start with num1 = 0 and num2 = 1.
   //The program first prints 0 and 1.
   //Then, the loop starts at the third number (i = 2) and calculates the next number in the series 
   //by adding the previous two numbers (num1 and num2).
   //After calculating, it updates num1 to num2 and num2 to the new number, then continues until it prints 10 numbers.