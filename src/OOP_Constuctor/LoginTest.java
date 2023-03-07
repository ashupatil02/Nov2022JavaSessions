package OOP_Constuctor;

public class LoginTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
    LoginPage lp1 = new LoginPage("ashu123.gmail.com", "ashu123");
       if ( lp1.doLogin()) {
    	   System.out.println("display the menu items");
       }
       LoginPage lp2 = new LoginPage("aarush123.gmail.com", "aarush123");
       System.out.println(lp2.userName);
       System.out.println(lp2.password);
	}

}
