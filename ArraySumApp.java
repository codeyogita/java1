import java.util.*;

class ArrSum
{
	protected int a[];
	void setArray(int a[])
	{
		this.a=a;
	}

}
class GetSum extends ArrSum
{
	int getSum()
	{
		 int sum=0;
           for(int i=0;i<a.length;i++)
            {
                sum=sum+a[i];
            }

                return sum;
			
	}
}

public class ArraySuminh
{
  public static void main(String args[])
    {

		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter The Array Values:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		GetSum gm=new GetSum();
		gm.setArray(a);
		int result=gm.getSum();
                System.out.println(result);
	}
}