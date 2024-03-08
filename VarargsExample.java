public class VarargsExample
{
  public static void displayNames(String ...names)
   {
     for(String mynames:names)
     {
      System.out.println(mynames+ " ");
      }
    }
  public static void main(String args[])
   {
     displayNames("Alex","Richard","ram");
}

}