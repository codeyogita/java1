import java.util.*;
public class Swapping
{
   public static void main(String x[])
     {
       int no=temp,last,count=0;
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the no");
           no= sc.nextInt();

              while(no!=0)
               {
                 no=no/10;
                 count++;
               }
               no=temp;
               last=no%10;

             int i=1;
               
               while(count<=1)
               {
                 no/=10;
                  i++;
             }
            System.out.println("The last no is"+last);
               System.out.println("the first no is"+no);
 
                
               
             
        
         

       

   }

}
