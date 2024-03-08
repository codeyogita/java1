import java.util.*;
class MissingElement
{
   int a[];
   public void setData(int a[]) 
    {
      this.a=a;
    }
   public void findMissing(int a)
   {
      int i,j,count=0;
     for(i=1;i<5;i++)
      {
         for(j=a[i]+1;j<a[i+1];j++)
           {
                  ++count;
           }
      }
 
}
public class MissElement
{
  public static void main(String x[])
   {
      MissingElement m= new MissingElement;
      Scanner sc=new Scanner(System.in);
        int no,i;
       System.out.in("Enter the no of array");
        no=sc.nextInt;
        m.setData(no);
        m.findMissing ();
    }
} 
   
   