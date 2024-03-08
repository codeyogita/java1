class ShowVariableinh
{
   int a,b;

     void setValue(int x,int y)
     {
           a=x;
           b=y;
   
     }
}

class Addition extends ShowVariableinh
{
      
      int getAddition()
      {
           return a+b;
       }
}

class Multiplication extends ShowVariableinh
{
    
    int getMultiplication()
    {
       return a*b;
    }
}

class Dividation extends ShowVariableinh
{
    int getDividation()
     {
       return a/b;
     }
}





public class CalculaterInhe
{
  public static void main(String x[])
   {
     Addition ad=new Addition();
      ad.setValue(10,20);
       int result=ad.getAddition();
         System.out.println(result);
    
    Multiplication mal=new Multiplication();
       mal.setValue(10,5);
         result=mal.getMultiplication();
          System.out.println(result);
    
      Dividation div=new Dividation();
       div.setValue(2,4);
        result=div.getDividation();
         System.out.println(result);


}

}


