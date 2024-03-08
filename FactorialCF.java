//Factorial using class and object.



class Factorial
{
   int no=1,i=1;
   void setValue(int no)
   {
     this.no=no;
   }
  int getFactorial()
   {
   for(i=1;i<=no;i++)
    {
      return no*i;
    

    }
  }

}

public class FactorialCF
{
public static void main(String x[])
{
   Factorial f1= new Factorial();
   f1.setValue(5);
   int result=f1.getFactorial();
   System.out.printf("Factorial is %d\n",result);
   ooo



}
}
  


     

  