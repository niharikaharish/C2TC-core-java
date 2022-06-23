package Multithreading;
public class InterThreadCommunication 
{
	int a;
	synchronized void set(int a1)
	{
		System.out.println("Setting Data"+a);
		this.a=a1;
	}
	synchronized void get()
	{
		System.out.println("Getting Data"+a);
	}
}