import java.util.*;
class SpecialChar
{
   char ch;
  void setChar(char ch)
   {
      this.ch=ch;
   }
    boolean checkChar(char ch)
    {
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')|| (ch>='0' && ch<='Z'))
          {
            return true;
          }
           else 
         {
             return false;
         }
}

}

public class SpecialApp
{
  public static void main(String x[])
    {
      Sccaner sc=new Scanner();
       System.out.println("Enter the Element");
         
    
      SpecialChar sp=new SpecialChar();
       sp.setChar(9);
       boolean b=sp.getSpecial();
        
       System.out.println(b);
  }
}
     
     


   

