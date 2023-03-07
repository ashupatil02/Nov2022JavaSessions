package BuilderPattern;

public class UserShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EcommApplication app = new EcommApplication();
		
		app.login("ashu@gmail.com", "ashu@123")
		.doSearch("macbook pro")
			.addToCart("macbook pro")
				.doPayment("1212 1212 1313 1444", 899)
					.generateOrder()
						.logout();
	
	System.out.println("------");
	
	app.login("ashu@gmail.com", "ashu@123")
		.doSearch("tshirt", 5000, "Nike")
			.addToCart("tshirt")
				.logout();
	
	System.out.println("------");
	app.login("ashu@gmail.com", "ashu@123")
		.addToCart("tshirt")
			.doPayment("ashu@hdfc")
			.generateOrder()
						.logout();
	
	
	System.out.println("------");
	app.login("ashu@gmail.com", "naveen@123")
		.logout();
	
	
	
	EcommApplication app1 = new EcommApplication();


	
}






		

	}


