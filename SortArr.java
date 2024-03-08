import java.util.*;
class SortArray
{
   int a[],i,j,temp;
  void setValue(int a[])
   {
     this.a=a;
   }
  int getSortArray()
  {
    for(i=0;i<5;i++)
    {
      for(j=i+1;j<5;j++)
       {
         if(a[i]>a[i])
          {
            temp=a[i];
             a[i]=a[j];
              a[j]=temp;
           }
        }
    }
   return a[i];
}
}
public class SortArr
{
public static void main(String x[])
{
   int a[]=new int[5];
   Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Array");
       for(int i=0;i<a.length;i++)
          {
            a[i]=sc.nextInt();    
          }
           SortArray sr=new SortArray();
          sr.setValue(a);
          int result= sr.getSortArray();
         System.out.println(result);
}
}
        
        
        
        
   
   


  

