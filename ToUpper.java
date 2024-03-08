//WAP to input string and convert lower case string to upper case without using toUpperCase() 
//method


import java.util.*;
class ToUpper
{
   public static void main(String x[])
    {
      
        Scanner sc=new Scanner(System.in);
          System.out.println("enter the string is:");
           String s=sc.next();
           char ch[]=s.toCharArray();
             for(int i=0;i<ch.length;i++)
                {
                   
                    if(ch[i]>='a' && ch[i]<='z')
                    {
                      ch[i]=(char)((int)ch[i]-32);
                    }
                    
              }
           System.out.println(ch);
}

}

                      
                       
                      
         
