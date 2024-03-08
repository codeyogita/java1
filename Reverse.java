import java.util.*;
public class Reverse
{
  public static void main(String x[])
{
 Scanner sc=new Scanner(System.in);

 int rev=0,rem,no;
 System.out.println("Enter the no");
 no=sc.nextInt();


  while(no!=0)
{
   rem=no%10;
   no=no/10;
   rev=rev*10+rem;
}
System.out.println("NO iS "+rev);
}
}