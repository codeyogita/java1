import java.util.*;
public class StrongNo
{
 public static void main(String x[])
  {
     Scanner sc=new Scanner(System.in);
         
       System.out.println("the no is ");
         int no=sc.nextInt();
           int sum=0,rem;
           while(no!=0)
            {
              int f=1;
               rem=no%10;
                no=no/10;
              for(int i=0;i<rem;i++)
               {
                 f =f*i;
               }
              sum=sum+f;
                      
              if(sum==no)
              {
             System.out.println("The no is strong");
              }
             else 
              {
                System.out.println("The no is not Strong");
              }
          }
}
}

                
                
               
              
     
  
   
   
