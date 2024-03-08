import java.util.*;
class Reverse2
 {
    public static void main(String X[])
      { 
         int rem,r=0,no;
         Scanner sc=new Scanner(System.in);
          System.out.println("Enter the no");
            no=sc.nextInt();
              while(no!=0)
               {
                   rem=no%10;
                    no=no/10;
                     r=r*10+rem;
               
                }
                  System.out.println(r);
        }
}
              