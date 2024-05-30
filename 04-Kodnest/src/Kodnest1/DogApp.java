package Kodnest1;
class Dog
{
	String name;
	String breed;
	void Bark()
	{
		System.out.println("Barking high");
	}
}
public class DogApp {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
        Dog d1=new Dog();
        d1.name="Scooby";
        d1.breed="PUG";
       // System.out.println("Details of Dog1");
       // System.out.println("Name:"+d1.name);
       // System.out.println("Breed:"+d1.breed);
       // d1.Bark();
        System.out.println("Details of Dog1");
        System.out.println("Name:"+d1.name);
        System.out.println("Breed:"+d1.breed);
        d1.Bark();
        
        Dog d2=new Dog();
        d2.name="Pluto";
        d2.breed="PITBULL";
        System.out.println("Details of Dog2");
        System.out.println("Name:"+d2.name);
        System.out.println("Breed:"+d2.breed);
        d1.Bark();
        
       
        
	}

}


