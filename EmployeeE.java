import java.util.*;
class Employee
 {
int progress;
   String name;
   int id;
   float basicSal,incrementsal=0,total=0;
   public void setInfo(String name,int id,float basicSal)
    {
       this.name=name;
       this.id=id;
        this.basicSal=basicSal;
    }
   public void setProgressPer(int progress)
    {
      if(progress>60)
      {
	System.out.println(basicSal);
	
        incrementsal=basicSal*30/100;
	
       System.out.println(incrementsal);
       }
else
{
System.out.println("error");
}
    }
  public void show()
  {  
     //total=basicsal+incrementsal;
     System.out.println("name:"+name);
     System.out.println("Id:"+id);
     System.out.println("Salary:"+basicSal);
System.out.println("jdhsjd:"+incrementsal);
     System.out.println("Final Salary:"+(incrementsal+basicSal));
  }  
    
}
public class EmployeeE
{
public static void main( String x[])
  {
    Scanner sc=new Scanner(System.in);
    String name;
int id;
     float basicsal;
     System.out.println("enter the name");
       name=sc.nextLine();
     System.out.println("enter the id");
      id=sc.nextInt();
     System.out.println("Enter the basicsalary");
      basicsal=sc.nextFloat();
     System.out.println("Enter the progress");
      int progress=sc.nextInt();
     Employee e=new Employee();
     e.setInfo(name,id,basicsal);
     e.setProgressPer(progress);
     e.show();
  }
}

     
   