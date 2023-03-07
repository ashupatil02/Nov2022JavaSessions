package OOPS_Inheritence;

public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.start();
		b.stop();
		b.autoPark();
   		b.refuel();
   		BMW.billing();
   		Car.billing();
   		BMW.display();
   		b.running();
   		b.payment("ashuSbi");
   	//	c.payment("ashuicici");
   		b.engine();
   		
   		Vehicle v =new BMW();
   		v.petrolEngine();
   		v.engine();

   		System.out.println("-----------"  );
   	Car c = new Car();	
   		c.start();
		c.stop();
   		c.refuel();
   		c.payment("ashuicici");
   		c.engine();
   		
   		Car c1 = new BMW();//top casting/up casting
   		
   		c1.start();
		c1.stop();
	//	c1.autoPark();
   		c1.refuel();
   		
   		BMW b1 = (BMW) new Car();// exception at runtime
   		
   	System.out.println("-------------");	
	Audi au = new Audi();
	au.start();
	au.theifSafty();
	BMW b2 = (BMW) new Vehicle();//exception at runtime

	
}
}



