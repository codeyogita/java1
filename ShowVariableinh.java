class ShowVariableinh
{
   int a,b;

  void setValue(int x,int y)
{
   a=x;
   b=y;
   
}
}

class Addition
{
 
 int getAddition(){
  return a+b;
}
}

class Multiplication
{
int getMultiplicatin()
{
   return a*b;
}
}



public class Calculater
{
  public static void main(String x[])
   {
     Addition ad=new Addition();
      ad.setValue(10,20);
       int result=ad. getAddition;
         System.out.println(result);
    
    Multiplicatin mal=new Multiplication();
       mal.setValue(10.5);
        int result=mal.getMultiplition;
          System.out.println(result);

}

}


