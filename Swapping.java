import java.util.*;
public class Swapping
{
 public static void main(String x[])
{
  Scanner sc=new Scanner(System.in);
   int a,b;
  System.out.println("Enter the no");
  a=sc.nextInt();
  b=sc.nextInt();
  System.out.println("no Before Swapping"+a +b);

    a=a+b;
    b=a-b;
    a=a-b;

  System.out.println("no after swapping"+a +b);
}

}
  









