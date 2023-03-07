package OOP_Constuctor;

public class CarTest {

	public static void main(String[] args) {
	    Car c4 = new Car("BMW");
	    
		Car c1 = new Car("audi","white" );
		
		Car c2 = new Car("tesla","red",90);
		
		Car c3 = new Car("Honda", "grey",40, false);
		
		System.out.println(c1.name + " " +c1.color);
		System.out.println(c2.name + " " +c2.color+ " " +c2.price);
		System.out.println(c3.name + " " +c3.color +c3.price + ""+c3.isAutomatic);
		

	}

}
