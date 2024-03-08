import java.util.*;
public class Capitalconv
{
public static void main(String x[])
{   char ch;
    
 // char ch[]= new char[5];
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the character");
  // for(int i=0;i<=ch.length;i++)
   {
   ch=sc.next().charAt;
   if(ch>='a' && ch<='z')
   {
//    int ascii=(int)ch-32;
       int ascii=(int)ch-32;
       ch=(char)ascii;
   }
}
System.out.printf("%c",ch);
}
}
   

      