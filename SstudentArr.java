import java.util.*;
class Student
{
   private int id,mark;
   private String name;
 
  public int setid(id)
  {
     this.id=id;
  }
  public int getid()
  {
    return id;
  }

  public String setname(name)
  {
      this.name=name;
  }
  public String getname()
  {
     return name;
  }

  public int setmark(mark)
  {
       this.mark=mark;
  }
  public int getmarks()
  {
     return mark;
  }
}

class Studentinfo
{
    Student std;
  
     void setStudentinfo(Student student)
    {
      std=Student;
    }
      void showinfo()
     {
       System.out.in(std.getid()+"\n"+std.getname()+"\n"+std.getmark()+"\n");
     }
};

public class StudentArr
{
  public static void main(String x[])
   {
      Student s= new Student();
      Studentinfo s1=new Studentinfo();
      s.setid(1);
      s.setname(ram);
      s.setmark(90);
      s1.setStudentinfo(s);
      s1.showinfo();
  }
} 
     

       

     