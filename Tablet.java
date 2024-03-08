import java.util.*;
class Table
{
   int a;
   public void setData(int a)
  {
     this.a=a;
  }
   public void showData()
   {
     for(int i=1;i<=10;i++)
     {
      System.out.println(a*i);
     }
   }
};
public class Tablet
{
public static void main(String x[])
{
  Scanner sc=new Scanner(System.in);
   int no,table;
    System.out.println("Enter the no");
     no=sc.nextInt();
      Table t=new Table();
      t.setData(no);
       t.showData();
 //System.out.printf("%d",table);
}
}

 