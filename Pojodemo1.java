import java.util.*;
class Student
{
   private int id;
   private String name;
   public void setid(int id)
   {
    this.id=id;
   }
   public int getid()
   {
    return id;
   }

   public void setname(String name)
   {
     this.name=name;
   }
   public String getname()
   {
     return name;
   }

 }

public class Pojodemo1
{
public static void main(String x[])
{
   Student s=new Student();
   s.setid(1);
   s.setname("abc");
	System.out.println(s.getid()+"\t"+s.getname());
  //System.out.println(s.getid+"\t"+s.getname);
}
}