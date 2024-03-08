import java.util.*;
class MergeArrayPara
{
  public static void main(String x[])
   {
     int a[]={1,2,3,4,5};
     int b[]={6,7,8};
     int a1=a.length;
     int b1=b.length;
     int c1=a1+b1;

     int[] c= new int[c1];
     
   for(i=0;i<a1;i++)
   {
     c[i]=a[i];
   }
   for(i=0;i<b1;i++)
   {
     c[i+1]=b[i];
   }
   for(i=0;i<c1;i++)
   {
     System.out.println(c[i]);
   }
}
}
