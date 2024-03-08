import java.util.*;
public class Perfect
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
 int rem,no,sum=0,i=1;
System.out.println("enter the no:");
no=sc.nextInt();
while(i<=no/2)
{
	if(no%i==0)
	{
	   sum=sum+i;
	}
	i++;
}
if(sum==no)
{
System.out.println("Perfect no");
}
else
{
System.out.println("not perfect no");
}

}
}

 


