import java.util.*;
class Employee
{
  private int id;
  private String name;
  private String designation;
  private int salary;

       public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}

class Company
{
  
    Employee e[];
    Company(Employee e[])
    {
      this.e=e;
    }
 void SortEmployee(employee e[])
 {
    for(int i=0;i<e.length;i++)
      {
         if(e[i].getSalary>e[j].getSalary)
          {
             int temp=e[i];
             e[i]=e[j];
             e[j]=temp;
          }
}
  System.out.println(e[i]);
   
}

}

}
public class EmployeeApp
{
  public static void main(String x[])
  {
    Scanner sc= new Scanner(System.in);
     Employee e[]=new Employee[5];
      System.out.println("Enter the Employee Details");
       for(int i=0;i<e.length;i++)
         {
            String name=sc.next();
            String designattion=sc.next();
            int id=sc.nextInt();
             int salary=sc.nextInt();


             e[i].setId();
             e[i].setDesignation();
              e[i]. setName();
               e[i].setSalary();

        

      Company c=new Company();
       c.SortEmployee();

           
          }
     }
}

     
      
      

        
    
    
       
         
       
      
  



    
    
         

       
         
       
