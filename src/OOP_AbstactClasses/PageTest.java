package OOP_AbstactClasses;

public class PageTest {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
	//	LoginPage lp = new LoginPage(10);
		lp.url();
		lp.resetPwd();
		lp.url();
		lp.displayLogo();
		lp.privacyPolicy();
		Page.pageCycle();
		LoginPage.pageCycle();
		
// top casting
		Page pg = new LoginPage();
		pg.title();
		pg.url();
		pg.displayLogo();
		pg.pageLoadingTime();
		
	}

}
