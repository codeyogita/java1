import java.util.*;
public class Max
{
     public static void main(String x[])
     {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int max;
System.out.println("Enter the Array");
for(int i=0;i<a.length;i++)
{
  a[i]=sc.nextInt();
}
max=a[0];
for(int i=0;i<a.length;i++)
{
if(a[i] > max)
{
max=a[i];
}
}

System.out.println(max);

}
}




  