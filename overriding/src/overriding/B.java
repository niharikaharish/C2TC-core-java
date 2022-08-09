package overriding;
public class B extends A
{
	int k;
	B(int a, int b, int c) {
		super(a, b);
		// TODO Auto-generated constructor stub
		k=c; 
	}
	private void Super(int a, int b) 
	{
		// TODO Auto-generated method stub	
	}
	void show() 
	{
		System.out.println("k="+k);
	}
}
