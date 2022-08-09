package inherit_multilevel;
public class Multilevel 
{
	public static void main(String[] args) 
	{
		Cost c1=new Cost(5,4,3,10,50);
		double vol;
		vol=c1.volume();
		System.out.println("Volume="+vol);
		System.out.println("Weight="+c1.weight);
		System.out.println("Cost="+c1.cost);
		}
}