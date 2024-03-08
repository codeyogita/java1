import java.util.*;
public class Perfect
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
 int rem,no,sum=0,i;
System.out.println("enter the no:");
for(i=1;i<no;i++)
{
 rem=no%10;
 if(rem==0)
{
sum=sum+i;
}
}
if(sum==no)
{
System.out.println("Perfect no");
}
else{
System.out.println("not perfect no");
}

}
}

 


