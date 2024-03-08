import java.util.*;

class Student
{
   private int id,mark;
   private String name;
 
 public void setId(int id){
      this.id=id;
   }

public void setName(String name){
   this.name=name;
 }

public void setMark(int mark){
   this.mark=mark;
 }

public int getId(){
  return id;
}

public String getName(){
  return name;
}

public int getMark(){
  return mark;
 }

}


class Studentinfo
{
      Student std[];
int size;
     void setStudentinfo(Student std[],int size)
    {
      this.std=std;
	this.size=size;
    }
     void showinfo()
     {
	 for(int i=0;i<size;i++){
       System.out.println(std[i].getId()+"\n"+std[i].getName()+"\n"+std[i].getMark());
	}
     }
}


public class StudentArr
{
  public static void main(String []x)
   {
      Student s= new Student();
      Scanner xy = new Scanner(System.in);
      
       System.out.println("How Many Students Are Added ---------------------->>");
       int size=xy.nextInt();
       Student sy[]= new Student[size];
       for(int i=0;i<size;i++){
          System.out.println("Ente the Student Id ,Name and Marks ---------------------->>");
       int id=xy.nextInt();
       String name=xy.next();
       int mar=xy.nextInt();
	
	sy[i]=new Student();
         sy[i].setId(id);
         sy[i].setName(name);
         sy[i].setMark(mar);
       }
Studentinfo s1=new Studentinfo();
s1.setStudentinfo(sy,size);
s1.showinfo();
  }
} 
     

       

     