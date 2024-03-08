class A
{	A(int no){
		System.out.println("Parents"+no);
	}
}
class B extends A{
	B()
	{
	//super();//implicit constructor
	super(150);
		System.out.println("Child");
	}
}
public class SuperApp{

	public static void main(String []x)
	{
		B b= new B();	
	}
}