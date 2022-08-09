package overriding;
public class Override 
{
	public static void main(String[] args) 
	{
		B objB=new B (10,20,30);
		A objA=new A (10,20);
		objA.show();
		objB.show();
		objB.add(); 
		}
}
