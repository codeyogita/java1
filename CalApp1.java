import java.util.*;
class Values
 {
    int a,b;
    void setValues(int a,int b)
    {
      this.a=a;
      this.b=b;
     }
  }
class Add extends Values
{
   int getAdd()
{
     return a+b;
}

}
class Mul extends Values
 {
     int getMul()
{
   
     return a*b;
 }
}
class Sub extends Values
{
     int getSub()
{
      return a-b;
}
}
public class CalApp1
{
  public static void main(String x[])
   {
      Add ad=new Add();
      ad.setValues(10,20);
     int result= ad.getAdd();
     System.out.println(result);
     
      Mul m1=new Mul();
       m1.setValues(4,6);
       result= m1.getMul();
     System.out.println(result);
     
     Sub s1=new Sub();
       s1.setValues(30,10);
       result= s1.getSub();
     System.out.println(result);
     }
}

  
    