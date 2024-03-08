import java.util.*;

public class Stdetail
{
  public static void main(String x[])
	{
	 Scanner sc=new Scanner (System.in);
 
   	String name;
   	int id;
   	float per;
	
	System.out.println("Enter The Id , Name & Percentage:\n");
	id=sc.nextInt();
	//sc.nextLine();
	name=sc.next();
	per=sc.nextFloat();

	char ch[]=name.toCharArray();
	
	System.out.println("Student Id Is: "+id);
//	System.out.print("Student Name Is: "+name);
	System.out.printf("\nStudent Percentage Is: %.2f",per);
	
 	for(int i=0;i<ch.length;i++)
	{
		System.out.print(ch[i]);
	}

	}
}

     
   


