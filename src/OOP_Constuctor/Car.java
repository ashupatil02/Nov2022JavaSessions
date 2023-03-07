package OOP_Constuctor;

public class Car {
	String name;
	String color;
	int price;
	boolean isAutomatic;
	
	public double getCarMilage() {
		double a = 12.33;
		double b = 22.33;
		double g = a+b;
		return g;
	}
	
	
	public Car(String name) {
	
		this.name = name;
	}


	public Car(String name, String color) {
		
		this.name = name;
		this.color = color;
	}
 public Car(String name, String color, int price) {
		
		this.name = name;
		this.color = color;
		this.price = price;
	}
 
public Car(String name, String color, int price, boolean isAutomatic) {
	
	this.name = name;
	this.color = color;
	this.price = price;
	this.isAutomatic = isAutomatic;
}


		
		// TODO Auto-generated constructor stub
	
	
public static void main(String[] args) {
    Car c = new Car("BMW");
    
	Car c1 = new Car("audi","white" );
	
	Car c2 = new Car("tesla","red",90);
	
	Car c3 = new Car("Honda", "grey",40, false);
	
	System.out.println(c1.name + " " +c1.color);
	System.out.println(c2.name + " " +c2.color+ " " +c2.price);
	System.out.println(c3.name + " " +c3.color +c3.price + ""+c3.isAutomatic);
	System.out.println(c.name);

}

}

	


