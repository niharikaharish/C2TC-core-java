package ExceptionalHandling;

import java.util.Scanner;

public class Testtrycatch2 {

	public static void main(String[] args) {
		try
		{
			Scanner sc =new Scanner(System.in); 
			int a, b;
			System.out.println("enter the value of a and b");
			a=sc.nextInt();
			b=sc.nextInt(); //may throw exception
			int data=a/b;
			System.out.println("data values is"+data); 
		}
			catch(ArithmeticException ae)
			{
				System.out.println("rest of the code...");
			}
		}
	}

