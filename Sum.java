import java.util.*;
public class Sum
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
 int no,sum=0,rem;
System.out.println("Enter the no:");
no=sc.nextInt();
 while(no!=0)
{
rem=no%10;
no=no/10;
sum=sum+rem;
}
System.out.println(+sum);
}
}


