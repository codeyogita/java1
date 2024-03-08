import java.util.*;
public class MorseCode {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String");
		String ss=s.nextLine();
		ArrayList al=new ArrayList();
		//al.add(ss);
		char ch[]=ss.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==65||ch[i]==97)
			{
				al.add(".-");
			}
			else if(ch[i]==66||ch[i]==98)
			{
				al.add("-...");
			}
			else if(ch[i]==67||ch[i]==99)
			{
				al.add("-.-.");
			}
			else if(ch[i]==68||ch[i]==100)
			{
				al.add("-..");
			}
			else if(ch[i]==69||ch[i]==101)
			{
				al.add(".");
			}
			else if(ch[i]==70||ch[i]==102)
			{
				al.add("..-.");
			}
			else if(ch[i]==71||ch[i]==103)
			{
				al.add("--.");
			}
			else if(ch[i]==72||ch[i]==104)
			{
				al.add("....");
			}
			else if(ch[i]==73||ch[i]==105)
			{
				al.add("..");
			}
			else if(ch[i]==74||ch[i]==106)
			{
				al.add(".---");
			}
			else if(ch[i]==75||ch[i]==107)
			{
				al.add("-.-");
			}
			else if(ch[i]==76||ch[i]==108)
			{
				al.add(".-..");
			}
			else if(ch[i]==77||ch[i]==109)
			{
				al.add("--");
			}
			else if(ch[i]==78||ch[i]==110)
			{
				al.add("-.");
			}
			else if(ch[i]==79||ch[i]==111)
			{
				al.add("---");
			}
			else if(ch[i]==80||ch[i]==112)
			{
				al.add(".--.");
			}
			else if(ch[i]==81||ch[i]==113)
			{
				al.add("--.-");
			}
			else if(ch[i]==82||ch[i]==114)
			{
				al.add(".-.");
			}
			else if(ch[i]==83||ch[i]==115)
			{
				al.add("...");
			}
			else if(ch[i]==84||ch[i]==116)
			{
				al.add("-");
			}
			else if(ch[i]==85||ch[i]==117)
			{
				al.add("..-");
			}
			else if(ch[i]==86||ch[i]==118)
			{
				al.add("...-");
			}
			else if(ch[i]==87||ch[i]==119)
			{
				al.add(".--");
			}
			else if(ch[i]==88||ch[i]==120)
			{
				al.add("-..-");
			}
			else if(ch[i]==89||ch[i]==121)
			{
				al.add("-.--");
			}
			else if(ch[i]==90||ch[i]==122)
			{
				al.add("--..");
			}
			else if(ch[i]==48)
			{
				al.add("-----");
			}
			else if(ch[i]==49)
			{
				al.add(".----");
			}
			else if(ch[i]==50)
			{
				al.add("..---");
			}
			else if(ch[i]==51)
			{
				al.add("...--");
			}
			else if(ch[i]==52)
			{
				al.add("....-");
			}
			else if(ch[i]==53)
			{
				al.add(".....");
			}
			else if(ch[i]==54)
			{
				al.add("-....");
			}
			else if(ch[i]==55)
			{
				al.add("--...");
			}
			else if(ch[i]==56)
			{
				al.add("---..");
			}
			else if(ch[i]==57)
			{
				al.add("----.");
			}
			else 
				al.add(" ");
		    }
			
		for(Object obj:al)
		{
			System.out.print(obj+"");
		}
		}
	}



