import java.util.*;
class AddAmt
{
	private int amount;
	
	AddAmt()
	{
		this.amount=50;
		
	}
	
	Addamt(int addition)
	{
		this.amount=50+addition;
	}
	
	public double getFinalAmount()
          {
       
               return this.amount;
          }
}
public class AddAmountAll {

	public static void main(String[] args) {
		
		AddAmt ad = new AddAmt();
		System.out.println("The Final Amount is"+ad.getFinalAmount());
		
	AddAmt ad1 = new AddAmt(30);
		System.out.println("After Adding final amount:"+ad1.getFinalAmount());
	}
		
		

	

}
