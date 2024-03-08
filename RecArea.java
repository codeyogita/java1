
import java.util.*;
class Rectangle1
{
   	int len;
	int bre;
	
	public Rectangle1()
	{
		int len=0;
		int bre=0;
	}
	
	public Rectangle1(int len)
	{
		this.len=len;
		this.bre=bre;
		
	}
	public Rectangle1(int len,int bre)
	{
		this.len=len;
		this.bre=bre;
	}
	
	public int getArea()
	{
	 	return len*bre;
              
             	
	}

	
	
	
	
}
public class RecArea {

	public static void main(String[] args) {
		
		Rectangle1 re=new Rectangle1();
		System.out.println("The Result is:"+re.getArea());
                
		
		Rectangle1 re1=new Rectangle1(5);
		 System.out.println("The Result is:"+re1.getArea());
		 
		 Rectangle1 re2=new Rectangle1(5,3);
		System.out.println("The Result is:"+re2.getArea());
		


	}

}

   