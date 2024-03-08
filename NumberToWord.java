import java.util.*;
public class NumberToWord
{
  public static void main(String x[])
   {
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no");
        int no=sc.nextInt();
        int rem=0 ,tem=no,rev=0;
         while(no!=0)
          {
          rem=no%10;
          no=no/10;

          rev=rev*10+rem;
           }
           
            no=rev;
            while(no!=0)
          {
          rem=no%10;
          no=no/10;
          
          switch(rem)
          {
             case 0:
               System.out.printf("zero");
             break;
             case 1:
               System.out.printf("one");
             break;
             case 2:
               System.out.printf("two");
             break;
             case 3:
               System.out.printf("three");
             break;
            case 4:
               System.out.printf("four");
             break;
                case 5:
               System.out.printf("five");
             break;
             case 6:
               System.out.printf("six");
             break;
             case 7:
               System.out.printf("seven");
             break;
            case 8:
               System.out.printf("eight");
             break;
             case 9:
               System.out.println("nine");
             break;
             
            }
}

}
}
 
                
              
          
        
         
         
          