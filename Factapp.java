import java.util.*;
class Factorial
{
  int a;
  void setValue(int a)
   {
     this.a=a;
   }
  int getFact()
  {
    int no=1;
    for(int i=1;i<=a;i++)
     {
        no=i*no;
     }
   return no;
  }
}


public class Factapp
{
  public static void main(String x[])
    {
       Factorial f1=new Factorial();
        f1.setValue(6);
        int result=f1.getFact();
      System.out.println(result);
}

}
      


     
      
     
 