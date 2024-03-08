import java.util.*;
class Sum
{
     int sum=0; 
      public void calSum(int ...x)
      {
         for(int i=0;i<x.length;i++)
         {
              sum=sum+x[i];
         }
     }
      void showSum()
      {

         System.out.println("sum is:="+sum);
      }
}
  public class SumApplication
   {
     public static void main(String x[])
     {
         Sum s=new Sum();
         s.calSum(10,20,30,40,50);
	 s.showSum();
       
     
          
}
}

        
      
     