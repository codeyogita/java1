import java.util.*;
public class Specialchar
{
  public static void main(String x[])
   {
    Scanner sc=new Scanner(System.in);
     char ch;
     System.out.println("Enter the input ");
      ch=sc.nextLine().charAt(0);
       if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
          {
            System.out.println("the input is Charecter");
           }
         else if(ch>='0' && ch<='9')
          {
           System.out.println("the input is Digit");
          }
      else
      {
       System.out.println("the input is Specialchar");
      }
}
}




 