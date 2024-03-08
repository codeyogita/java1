class Area
{
  int len,wid;
  float radius;
  void setValue(float radius)
     {
        this.radius=radius;                                                                                    
     }
  void setValue(int len,int wid)
     {
       this.len=len;
       this.wid=wid;
     }
}

class Circle extends Area
{
      float pi=3.14f;
     float getCircleArea()
      {
        return pi*radius*radius;
      }
 }
 
class Rectangle extends Area
 {
    int getRectangleArea()
        {
             return len*wid;
        }
 }

public class AreaInhr
{
  public static void main(String x[])
   {
      Circle c=new Circle();
      c.setValue(4.5f);
      float result=c.getCircleArea();
         System.out.println(result);

         Rectangle rec=new Rectangle();
         rec.setValue(20,10);
         result=rec.getRectangleArea();
         System.out.println(result);
}
}
          
     



  
 

  