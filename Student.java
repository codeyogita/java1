import java.util.*;
public class Student
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
 int s1,s2,s3,s4,s5,per,total=0;
System.out.println("Enter the Sub1 marks:");
s1=sc.nextInt();
System.out.println("Enter the Sub2 marks:");
s2=sc.nextInt();
System.out.println("Enter the Sub3 marks:");
s3=sc.nextInt();
System.out.printf("Enter the Sub4 marks:");
s4=sc.nextInt();
System.out.println("enter the Sub5 marks:");
s5=sc.nextInt();


total=s1+s2+s3+s4+s5;

System.out.println("percentage is"+total);
per=total/5;
System.out.println("percentage is"+per);
}
}


