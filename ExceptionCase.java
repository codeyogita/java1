import java.util.*;
public class ExceptionCase {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose The condition");
		System.out.println("1:ArithmeticException");
		System.out.println("2:ArrayIndexOutOf Box");
		System.out.println("3:NullpointerException");
		System.out.println("4:ClassNotfoundException");
		System.out.println("5: numberFormatException");
		System.out.println("6:InputMismatchException");
		
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			try
			{
				int result=10/0;
				
			}
			catch(ArithmeticException ex)
			{
				System.out.println("The Exception is"+ex);
			}
			break;
		case 2:
			try
			{
				int[] arr = {1, 2, 3};
                System.out.println(arr[3]);
				
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{
				System.out.println("The Exception is"+ex);
				
			}
			break;
		case 3:
			try
			{
				String x=null;
			}
			catch(NullPointerException ex)
			{
				System.out.println("The Exception IS"+ex);
				
			}
			break;
		case 4:
			try 
			{
				Class.forName("not Display");
			}
			catch(ClassNotFoundException ex)
			{
				System.out.println("The Exception is:"+ex);
			}
			break;
		case 5:
			try
			{
				String str="acs";
				int num=Integer.parseInt(str);
			}
			catch(NumberFormatException ex)
			{
				System.out.println("The Exception is"+ex);
			}
			break;
		case 6:
			try
			{
                                
				System.out.println("Enter an Integer");
				int no=sc.nextInt();
			}
			catch(InputMismatchException ex)
			{
				System.out.println("The Exception is:"+ex);
				
			}
			break;
		
			default:
				System.out.println("Invalid Choice");
		}
		

	}

}