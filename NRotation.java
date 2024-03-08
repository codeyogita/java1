import java.util.*;
public class NRotation
{
  public static void main(String x[])
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array");
          int a[]=new int[7];
          for(int i=0;i<a.length;i++)
           {
             a[i]=sc.nextInt();
           }
           System.out.println("enter the index");
            int index=sc.nextInt();
            
            for(int i=0;i<index;i++)
             {
              //  int temp=a[0];
                for(int j=1;j<a.length;j++)
                {
                   a[j-1]=a[j];
                }
                a[a.lenght-1]=temp;
            }
         System.out.println("Display array");
          for(int i=0;i<a.length;i++);
            {
              System.out.println(a[i]+"");
            }
    }
}
         
                
