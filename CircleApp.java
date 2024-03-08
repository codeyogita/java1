import java.util.*;
class Circle
{
  float radius,pi=3.14f,area;
 public void setData(float radius)
  {
    this.radius=radius;
  }
   public void showData()
   {
     area=pi*radius*radius;
     System.out.println(area);
     }
};
public class CircleApp
{
 public static void main(String x[])
  {
   float radius,area;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the radius");
    radius=sc.nextFloat();
    Circle c=new Circle();
    c.setData(radius);
    c.showData();
   }
}
    
    
    
   
   
    
  
 