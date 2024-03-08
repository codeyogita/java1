//cube using class and function.


class Cube
  {
    int no;
    void setValue(int no)
      {
         this.no=no;
          
      }
     int getCube()
      {
     return no*no*no;
       }
}
public  class Cubecs
{
  public static void main(String x[])
   {
     Cube c1=new Cube();
      c1.setValue(3);
      int result=c1.getCube();
     System.out.printf("Square is %d\n",result);
   }

}









         
        
