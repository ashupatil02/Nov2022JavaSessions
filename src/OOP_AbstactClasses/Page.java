 package OOP_AbstactClasses;

public abstract class Page implements Web {
	
	public Page() {
		System.out.println("page-----Constructor");
	}
	public Page( int i ) {
		System.out.println("page-----Constructor" +i );
	}


	public abstract void title();
	public abstract void url();
	
	public final void displayLogo()
	{
		System.out.println("page ---------logo");
		
	}
	public void pageLoadingTime()
	{
		System.out.println("page loading time 10 sec");
		
	}

	public  static void pageCycle()
	{
		System.out.println("page cycle");
		
	}
	@Override
public void privacyPolicy() {
	System.out.println("page ------ privacy policy");
}
}
