class Addition
{
	int a,b;
	Addition(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	int getAdd()
	{
	return a+b;
        }
   
}

public class AddDigCon
{
	public static void main(String x[])
	{
		Addition ad= new Addition(10,20);
		int result= ad.getAdd();
		System.out.println(result);
		 
	}
	
}





