import java.util.*;
public class TwoArray
{
  public static void main(String x[])
   {
     Scanner sc=new Scanner(System.in);
           int a[] []=new int[2][2];
           int a,b;
          
      
       System.out.println("enter the element in array");
          for(int i=0;i<a[i].length;i++)
            {
             for(int j=0;j<a[j].length;j++)
              {
                a[i][j]=sc.nextInt();
              
              }
         }
         System.out.println(" the matrix is");
         
           for(int i=0;i<a.lenght;i++)
            {
              for(int j=0;j<a[i].lenght;j++)
               {
                    System.out.printf("%d\t",a[i][j]);
               }
            System.out.printf("\n");
            }
          System.out.println("The treanfose matrix");
          
             for(int i=0;i<a.lenght;i++)
            {
              for(int j=0;j<a[i].lenght;j++)
               {
                    System.out.printf("%d\t",a[i][j]);
               }
            System.out.printf("\n");
            }
}

}

              
         

              