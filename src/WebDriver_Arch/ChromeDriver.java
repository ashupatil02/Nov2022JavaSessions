package WebDriver_Arch;

public class ChromeDriver implements WebDriver {
	
	public ChromeDriver() {
		System.out.println("chrome is launched........");
	}

	@Override
	public void findElement(String element) {
		System.out.println("find element:" +element);
		
	}

	@Override
	public void get(String url) {

		System.out.println("enter the url:" +url);	
	}

	@Override
	public String getTitle() {
		System.out.println("getting the page");
		
		return "Naveen automatiom labs";
	}

	@Override
	public void click(String element) {
		System.out.println("clicking on element:" +element);
		
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("entering value:"   + value + "int0" +element);
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
