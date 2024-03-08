import java.util.*;
abstract class Calc
{
	protected int value1;
	protected int value2;
	
	public void setValue(int val1,int val2)
	{
		this.value1=val1;
		this.value2=val2;
	}

}

class Add extends Calc
{
	public void  getAddition()
	{
		
		
		System.out.println("The Addition is "+"\t"+(value1+value2));
		
	}
}
class Mul extends Calc
{
	public void  getMul()
    {
	  System.out.println("The Multiplicatin is "+"\t"+(value1*value2));
    }
}
class Div extends Calc
{
	public void getdiv()
	{
		
		System.out.println("the Division is"+"\t"+(value1/value2));
	}
}
class Sub extends Calc
{
	public void getSub()
	{
		
		
		System.out.println("the Division is"+"\t"+(value1-value2));
	}
}
public class Calculator1 {

	public static void main(String[] args) {
		
		Add ad=new Add();
		Mul m1=new Mul();
		Div d1=new Div();
		Sub s1=new Sub();
		
		
		ad.setValue(10, 20);
		m1.setValue(5,6);
		d1.setValue(8, 2);
		s1.setValue(50,10);
		
	   ad.getAddition();
        m1.getMul();
        d1.getdiv();
        s1.getSub();
	}

}
