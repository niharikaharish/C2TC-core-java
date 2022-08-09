package Constructors;
public class parameter {
	int age;
	String name,dob,college;
	parameter(String n, String c, String d, int i){
	age=i;
	name=n;
	dob=d;
	college=c;
	}
	void display()
	{
	System.out.println("Name:"+name);
	System.out.println("College:"+college);
	System.out.println("DOB:"+dob);
	System.out.println("Age:"+age);
	}
	public static void main(String[] args)
	{
	parameter p1=new parameter("Niharika Harish","DR.AIT","26/05/2000",22);
	p1.display();
	parameter p2=new parameter("XYZ","DR.AIT","01/01/2000",22);
	p2.display();
	}
}
