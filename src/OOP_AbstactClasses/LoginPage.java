package OOP_AbstactClasses;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println(" Loginpage-----Constructor");
	}
	public LoginPage(int i) {
		System.out.println(" Loginpage-----Constructor" +i);
	}
 

	@Override
	public void title() {
	System.out.println("LP------title");
		
	}

	@Override
	public void url() {
		System.out.println("LP-----------url");
		
	}
	
  public void resetPwd() {
	  System.out.println("LP-------reser PWD");
  }
  
  @Override
  public void pageLoadingTime() {
	  System.out.println("LP page loadind time 5 sec ");
  }
    
 public static void pageCycle() {
	 
	 System.out.println(" login page cycle");
 }
@Override
public void privacyPolicy() {
	System.out.println("loginpage----pricacy policy");
	
	
}
}
