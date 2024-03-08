import java.util.*;
class CountNo
{
 public static void main(String x[])
   {
     int sum=0;
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no");
       String st=sc.next();
        char ch[]= st.toCharArray();
         for(int i=0;i<ch.length;i++)
          {
             if(ch[i]>='0' && ch[i]<='9')
              {
                 sum=sum+(int)ch[i]-48;
               }
            }

            System.out.println(sum);
}
}
         
                   