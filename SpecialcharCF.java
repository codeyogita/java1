import java.util.*;
class Specialchar
{
  char ch,boolean=true;
  void setChar(char ch)
   {
     this.ch=ch;
   }
  boolean checkChar()
  {
    if((ch>='a' && ch<='z' || ch>='A' && ch<='Z'||ch>=0 &&ch<=9))
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
        ch=ch=sc.nextLine().charAt(0);
           Specialchar sp=new SpecialChar();
           sp.setChar();
           boolean result=sp.checkChar();
           if(result==true)
           {
             System.out.println("digit");
           }
            else
           {
            System.out.println("Special Sysmbol");
           }

}
}




     
     
       
     
 

  
  

