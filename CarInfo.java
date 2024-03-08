class Vehical
{
	String color,model;
	int year;
	public void SpecialFe(String color,String model,int year)
	{
		this.color=color;
		this.model=model;
		this.year=year;
		
	}
	
}
class Car1 extends Vehical
{
	int door;
    public void doorNo(int door)
    {
    	this.door=door;
    }
    
    public Car1(String color,String model,int year,int door)
    {
       this.color=color;
       this.model=model;
		this.year=year;
    	this.door=door;
    }
    
    public void displayAll()
    {
    	System.out.println(color);
    	System.out.println(model);
    	System.out.println(year);
    	System.out.println(door);
    	
    }
    
}
public class CarInfo {

	public static void main(String[] args) {
		
		Car1 c=new Car1("red","toyato",2000,4);
		
			c.displayAll();	

		
		
	}

}
  