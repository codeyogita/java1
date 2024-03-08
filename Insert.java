import java.util.*;
public class  Insert
{
public static void main(String x[])
{
 Scanner sc=new Scanner(System.in);
  int a[]=new int[5];
   int value,i,index;
   System.out.println("Enter the no in array");
     for(i=0;i<a.length-1;i++)
    {
     a[i]=sc.nextInt();
    }
    
        System.out.println("Enter the index");
        index=sc.nextInt();
       
        System.out.println("Insert the no");
        value=sc.nextInt();
       for(i=a.length-1;i>index;i--)
       {
          a[i]=a[i-1];
       }
         a[index]=value;
        for(i=0;i<a.length;i++)
      {
        System.out.println(a[i]);
      }
}
}
    
        
     

     
       
      
     
  
