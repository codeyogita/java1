import java.util.*;
class Rectangle
{
   int len,wid,area;
  public void setvalue(int len,int wid)
  {
    this.len=len;
    this.wid=wid;
  }
  public void showValue()
  {
    area=len*wid;
  System.out.println(area);
}
}
public class RectangleApp
{
 public static void main(String x[])
  {
   
    Scanner sc=new Scanner(System.in);
     int len,wid,area;
      System.out.println("Enter the lengh");
      len=sc.nextInt();
      System.out.println("Enter the width");
      wid=sc.nextInt();
      Rectangle r=new Rectangle();
      r.setvalue(len,wid);
      r.showValue();
}
} 
   



   
    
    
   