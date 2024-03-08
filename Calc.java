import java.util.*;
abstract class Value
{
  int value1,value2;
   public void setValue(int val1,int val2)
    {
          this.value1=val1;
          this.value2=val2;
    }
  
}
class Add extends Value
{
   public void getAdd()
    {
         System.out.println("the Addition is"+(value1+value2));
   }
}
 
class Mul extends Value
{
  public void getMul()
  {
      System.out.println("The MulTiplicatin is"+ (value1 * value2));
  }
}
class Sub extends values
{
   public void getSub()
     { 
         System.out.println("the Substraction"+(value1-value2));
     }
}
class Div extends values
{
   public void getDiv()
     { 
         System.out.println("the Division"+(value1/value2));
     }
}
public class Calc
{
   public static void main(String x[])
     {
          Add a1=new Add(10,20);
          Mul m1=new Mul(5,6);
          Div d1=new Div(5,2);
          Sub s1=new Sub(50,20);
          
          a1.getAdd();
          m1.getmul();
          d1.getdiv();
           s1.getsub();
    }
}

   



   


  