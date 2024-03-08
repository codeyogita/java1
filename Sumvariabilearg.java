 import java.util.*;
class Sum
{
     int x,sum=0;
     public void setData(int ...x)
      {
        this.x=x;
      }
     public void showSum()
      {
       for(int i=0;i<x.length;i++)
        {
         sum=sum+x[i];
        }
    System.out.println(sum);
     }
}
  public class Sumvariablearg
   {
     public static void main(String x[])
     {
         Sum s=new Sum();
         s.setData(10,20,30,40,50);
       
     
          
}
}

        
      
     