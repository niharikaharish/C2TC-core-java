package inherit_multilevel;
	public class Cost extends Boxweight
	{
		double cost;
		Cost(double w,double h, double d, double wt, double c)
		{
		super(w,h,d,wt);
		cost=c;
		}
}