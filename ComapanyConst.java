class EmpInfo
{
  private int id;
  private String name;
  private int sal;
 
  public void setid(int Id)
  {
    this.id=Id;
  }
  public int getid()
  {
    return id;
  }
  public void setname(String Name)
  {
     this.name=Name;
  }
  public String getname()
  {
     return name;
  }
  public void setsal(int Sal)
  {
     this.sal=Sal;

  }
  public int getsal()
  {
     return sal;
  }
}
class Employee
{
   public EmpInfo e;
 Employee(EmpInfo einfo)  {
   this.e=einfo;
  }

 void showDetail()
 {
   System.out.println(e.getid()+"\t"+e.getname()+"\t"+e.getsal());
  }
}

public class ComapanyConst
{
 public static void main(String x[])
  {
   
 EmpInfo einfo=new EmpInfo();
     einfo.setid(1);
     einfo.setname("ram");
     einfo.setsal(1000);
     Employee emp=new Employee(einfo);
     emp.showDetail();

   }
}





