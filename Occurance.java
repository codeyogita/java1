import java.util.*;
public class Occurance
{
 public static void main(String x[])
  {
    Scanner sc = new Scanner(System.in);
    {
      int a[]=new int[5];
        int i,j,count=1,temp;
      System.out.println("Enter the Array");
       for(i=0;i<a.length;i++)
       {
         a[i]=sc.nextInt();
       }
      for(i=0;i<5;i++)
        {
          for(j=i+1;j<5;j++)
           {
             if(a[i]> a[j])
              {
                  temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
               }
            }
        }
      System.out.println("Array after sort");
       for(i=0;i<a.length;i++)
        {
          System.out.println(a[i]);
        }  
	System.out.println("Occurance");
	
         for( i=0;i<a.length;)
	{
	    for(j=i+1;j<a.length;j++)
	    {
		if(a[i]==a[j])
		{
		    ++count;
		}
	         else
		{
		   break;
		}
	    }
	    System.out.println(a[i]+"\t"+count);
	    i=j;
	    count=1;
	
	}
	
}
}
}
               


