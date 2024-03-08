import java.util.*;
class Company
{
   private int id,sal;
   private String name;
 public void setId(int id)
      {
        this.id=id;
      }
 public void setName(String name)
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
 public String getName()
   {
     return name;
   }
 public int getSal()
   {
      return sal;
   }
}

class Employee
{
   Company c[];
  int size;
  void setData(Company c[],int size)
    {
      this.c=c;
      this.size=size;
    }
 void showData();
 {
     for(int i=0;i<size;i++)
     {
        System.out.println(c[i].getId()+"\n"+c[i].getName()+"\n"+c[i].getSal());
     }
}
}


public class CompanyApp
{
   public static void main(String x[])
    {
       Company c[]=new Company();
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Size of Array");
           int size=sc.nextInt();
             Company cm=new Company[size];
           for(int i=0;i<=size;i++)
{
           System.out.println("Enter the name id And Salary of Employee");
              int id=sc.nextInt();
              String name=sc.next();
               int sal=sc.nextInt();
                cm[i]=new Company();
                cm[i].setId(id);
                cm[i].setName(name);
                cm[i].setSal(sal);

}
           // System.out.println("Display the name id And Salary of Employee");
               Employee e1=new Employee();
                e1.setData(cm,size);
                e1.showData();
              
}
}   
                
       
       
      
       






  
   