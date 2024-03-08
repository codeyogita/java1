import java.util.*;
public class du
{
 public static void main(String x[])
 {
  int no,rem=0,flag=0;
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter the no:");
   no=sc.nextInt();
   while(no!=0)
   {
    	rem=no%10;
   	  no=no/10;
  	  if(rem==0)
    	 {
            flag=1;

    	 }
   }
	if(flag==1)
	{

		System.out.println("duck");
         }
	else
	{
	      System.out.println("not ducK");
	}
   }
}






     

