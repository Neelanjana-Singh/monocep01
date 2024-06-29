package Kodnest1;
class Car
{
	String brand;
	String color;
	int price;
	void accelerate()
	{
		System.out.println("car accelerate");
	}
	
}
public class oops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.brand="Maruti";
		c.color="Blue";
		c.price=1200000;
		System.out.println("Brand:"+c.brand);
		System.out.println("Color:"+c.color);
		System.out.println("Price:"+c.price);
		c.accelerate();

	}

}
