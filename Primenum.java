import java.util.*;
public class PrimeNum
{
 public static void main(String x[])
  {
     int no,i;
      boolean flag=true;

    Scanner sc= new Scanner(System.in);
      System.out.println("Enter the no");
       no=sc.nextInt();
      for(i=2;i<=no/2;i++)
     {
       if(no%i==0)
        {
          flag=false;
          break;
        }
   }
       if(flag)
      {
       System.out.println("num is prime");
      }
    else
    {
     System.out.println("num is not prime");
    }
}
}


      
        

