class ParentArray
{
  int a[];
   void setValue(int a[])
   {
      this.a=a;
   }
	void arrangeSeq()
         {
            for(i=0;i<5;i++)
          {
             System.out.println(a[i]);
           }
}
}
class AssendingOrd extends ParentArray
{

 void arrangeSeq(){
  int j,temp;

    for(i=0;i<5;i++)
      {
        for(j=i+1;j<5;j++)
          {
            if(a[i]>a[j])
            {
		temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
          }
      }
     for(i=0;i<5;i++)
       {
         System.out.println(a[i]);
       }


}
}

class Reverse extends ParentArray
{
 
 void arrangeSeq()
  {
     int len,e,s,m;
       len=a[i]/a[0];
       e=len-1;
      // s=a[0];
       m=len/2;
   for(s=0;s<m;s++)
   {
     temp=a[s];
     a[s]=a[e];
     a[e]=temp;
       e--;
   }
   System.out.println("The reverse Is"+a[e];
  }
}

public class ArraSeriesInt
{
  public static void main(String x[])
    {
      Scanner sc=new Scanner(System.in);
        int a[]=new a[5];
        println("Enter the array Element"+a[i]);
        for(i=0;i<a.lenght;i++)
        {
             a[i]=sc.nextInt();
        }
          Reverse rev=new Reverse();
           rev.setValue(a);
           rev.showData();
      }
}

          
          
    
        
         
   
            
