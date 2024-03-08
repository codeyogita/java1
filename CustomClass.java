import java.util.*;
class Insert
{
     int a,b;
     public void setData(int a,int b)
       {
          this.a=a;
          this.b=b;
       }
    public void Addition()
     {
         System.out.println("The Addition is:"+(a+b));
     }
}
 public class CustomClass
{
   public static void main(String x[])
    {
          Insert i1=new Insert();
          i1.setData(10,30);
          i1.Addition();
    }
}


