import java.util.*;
class Cube3
{
   int a;
   void setValue(int a)
   {
      this.a=a;
   }
    int getCube()
  {
    return a*a*a;
  }
   
}
 public class GetCube
 {
   public static void main(String x[])
    {
      Cube3 c=new Cube3();
        c.setValue(5);
        int result= c.getCube();
        System.out.println("The cube is"+result);
      }
  }


    