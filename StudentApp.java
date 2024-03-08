import java.util.*;
class Student
{
   int m[]=new int[6],i;
   float sum=0,avg; 
   public void setValue(int m[])
   {
         this.m=m;
   }
   public void calculatePer()
   {
     for(i=0;i<6;i++)
      {
        sum=sum+m[i];
      }
	System.out.println("Array Value Sum Is "+sum);
   }
      public void checkAvg()
     {
      avg=sum/6;
      System.out.println("Average Is "+avg);
    }
}
public class StudentApp
{
 public static void main(String x[])
{
 Scanner sc=new Scanner(System.in);
 int m[]=new int[6];
   System.out.println("Enter the marks");
      for(int i=0;i<6;i++)
       {
	m[i]=sc.nextInt();
       }
         Student s=new Student();
         s.setValue(m);
         s.calculatePer();
         s.checkAvg();
    }
}  
     

 
      
     
          
   
