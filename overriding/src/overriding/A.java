package overriding;
public class A 
{
	int i,j,sum;
	A(int a, int b) 
	{
	i=a;
	j=b; 
	}
	void add() 
	{
	sum=i+j;
	System.out.println("Sum of two integers:"+sum); 
	}
	void show() 
	{
	System.out.println("A="+i+"B="+j); 
	}
}
