import java.util.*;
class Specialchar
{
  char ch;
  void setChar(char ch)
   {
     this.ch=ch;
   }
  boolean checkChar()
  {
    if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'||ch>='0' &&ch<='9')
     {
        return true;
     }
    else
    {
       return false;
   }
}

}

public class SpecialCharFC
{
   public static void main(String x[])
    {
     Scanner sc=new Scanner(System.in);
     char ch;
     System.out.println("Enter the input");
        ch=sc.nextLine().charAt(0);
           Specialchar sp=new Specialchar();
           sp.setChar(ch);
           boolean result=sp.checkChar();
           if(result==true)
           {
             System.out.println("digit or Alpha");
           }
            else
           {
            System.out.println("Special Sysmbol");
           }

}
}




     
     
       
     
 

  
  

