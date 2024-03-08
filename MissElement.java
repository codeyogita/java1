 import java.util.*;
 public class MissElement
  {
    public static void main(String x[])
     {
         int count;
        Scanner sc=new Scanner(System.in);
         int a[]=new int[5];
      System.out.println("enter the No in Array");
       for(int i=0;i<a.length;i++)
       {
          a[i]=sc.nextInt();
        }
       System.out.println("Missing number is");
        for(int i=0;i<a.length;i++)
          {
            for(int j=a[i]+1;j<a[i+1];j++)
              {
                 System.out.println(j);
           }
      }
      
    }
}