import java.util.*;
public class Sevenpattern
{
  public static void main(String x[])
  {
    
      int f=0;
       for(int i=1;i<=5;i++)
        {
          for(int j=1;j<=17;j++)
           {
             if(j>=10-i && j<=9+i && f==0)
              {
                 System.out.print(i);
                f=1;
               }
             else
              {
                 System.out.print("*");
                   f=0;
               }
             }
            System.out.println(" ");
          }
        }
      }
               