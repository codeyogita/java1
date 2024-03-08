import java.util.*;
class Employee
{
  private int id,sal;
  private char name;

public void setID(int id)
{
  this.id=id;
}
public void setName(char name)
{
   this.name=name;
}
public void setSal(int sal)
{
   this.sal=sal;
}
public int getId()
{
   return id;
}
class Company
{
private Employee e[];
{
public void SetEmployee(Employee e[])
{
   this.e=e;
}
public void getEmployee()
{
for(int i=0;i<=e.lenght;i++)
{
System.out.println(e[i].getid()+"\t"+e[i].getname()+"\t"e[i].getSal());
}
}

public class EmployeeApp
{
  public static void main(String x[])
   {
       Scanner sc=new Scanner(System.in);
         {
          for(int i=0;i<b.lenght;i++)
            {
              System.out.println("Enter the details");
                 int id= sc.nextInt ();
                   String name=sc.nextInt();
                     int sal=sc.nextInt();
               }
              Employee e=employee();
              e[i]=new employee();
              e[i]=setId(id);
              e[i]=setName(name);
              e[i]=setSal(sal);
   }
      Company c=new Company();
      c.setEmployee(e);
       c.getEmployee(e);
}
}  