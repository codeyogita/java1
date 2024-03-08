import java.util.*;
public class Grossal
{
public static void main(String x[])
{
 Scanner sc=new Scanner(System.in);
 int bs,da,hra,gs;                                                                              
System.out.println("Enter the basic Salary");
  bs=sc.nextInt();
da=(bs*30)/100;
hra=(bs*30)/100;
gs=bs+da+hra;

System.out.println("the salary is:"+gs);
}

}