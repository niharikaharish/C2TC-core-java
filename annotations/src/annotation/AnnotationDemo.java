package annotation;
import java.lang.annotation.Annotation;
import annotation.SmartPhone;
@SmartPhone()
class Nokia_Series
{
String model;
int screensize;
public Nokia_Series(String model, int screensize) 
{
this.model=model;
this.screensize=screensize;
}
}
public class AnnotationDemo 
{ 
public static void main(String[] args) 
{
Nokia_Series obj=new Nokia_Series("Fire", 4);
System.out.println(obj.model); 
System.out.println(obj.screensize);
Class c=obj.getClass();
Annotation an=c.getAnnotation(SmartPhone.class);
SmartPhone s=(SmartPhone) an;
System.out.println(s.os()); 
System.out.println(s.version());
}
}
