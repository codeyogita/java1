import java.util.*;
class Power
{
  int index,base,power=1;
  public void setValue(int index,int base)
  {
   this.index=index;
   this.base=base;
  }
     public void show()
      {
        for(int i=1;i<=index;i++)
         {
            power=power*base;
         }
         System.out.println(power);
      }
};
public class PowerApp
{
   public static void main(String x[])
   {
     Scanner sc=new Scanner(System.in);
     int index,power,base;
     System.out.println("Enter the power and base");
     index=sc.nextInt();
     base=sc.nextInt();
     Power p=new Power();
     p.setValue(index,base);
     p.show();
     // System.out.println(power);

   }
} 

   

