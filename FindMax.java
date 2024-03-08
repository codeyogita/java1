import java.util.*;
class Max
{  
   private int a[],max;

    void setArray(a)
    {
      this=a.a;
    }
  int getMax();
   {
     for(i=0;i<a.length;i++)
       {
         a[0]=max;
         if(a[i]>max)
          {
            max=a[i];
          }
       }
    return max;
}
}
public class FindMax
{
  public static void main(String x[])
   {
      Scanner sc=new Scanner(System.in);
       int a[]=new int[5];
        
       System.out.println("Enter the Array");
         for(int i=0;i<a.length;i++)
          {
            a[i]=sc.nextInt();
          }
            Max m= new Max();
           m.setArray();
          int result= m.getMax();
         System.out.println(Max);
}
}

    
          
           

   
  
  