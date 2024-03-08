class PersonalInfo
{
   String fname,mname,lname;

   PersonalInfo(String fname,String mname,String lname)
   {
     this.fname=fname;
     this.mname=mname;
     this.lname=lname;

    System.out.println("THE PERSNAl Info"+fname);
    System.out.println(mname);
    System.out.println(lname);
  }
     

}
class ProfessionalInfo extends PersonalInfo
{
      String des,skill;
      int id,sal;
      ProfessionalInfo(int id,int sal,String des,String skill)
       {
         super("ram","sham","jadhav");
            this.id=id;
            this.sal=sal;
            this.des=des;
            this.skill=skill;
         System.out.println(id);
         System.out.println(sal);
         System.out.println(des);
         System.out.println(skill);

       }
 }
public class ProjectApp
{
  public static void main(String x[])
   {
      ProfessionalInfo pro=new ProfessionalInfo(1,2000,"hr","java");
    }
}
   
       

      
        
          
        
        

  
   



   
   
  
  