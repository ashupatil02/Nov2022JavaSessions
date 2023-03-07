package OOPS_Inheritence;

public class BMW  extends Car{
@Override	
	public void start() {

		System.out.println(" BMW ----start");
	
	}
	public void autoPark() {
		
		System.out.println(" BMW----- autoparking");
	}
	
	public static void billing() {
		
		System.out.println("BMW ---billing");
	}
	@Override
	public  void payment(String cc,int ccv) {

		System.out.println("BMW payment using : +cc"+ ":" +ccv  );
		
}	
	@Override
	public  void payment(String upi) {
		System.out.println("BMW payment using : "  +upi);
	}
	@Override
		public   void engine() {
			System.out.println(" BMW------- engine");
		}
		

}


	


