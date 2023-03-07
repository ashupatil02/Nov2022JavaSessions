package OOPS_Inheritence;

public class Car extends Vehicle {
	
	public  void start() {
		System.out.println(" car start");
	}
		public void stop() {
			System.out.println(" car stop");
		}
		public void refuel() {
			System.out.println(" car refuel");
		}
	//	@Override
		public static void billing() {
			System.out.println("car ---billing");
		}
		@Override	
		public  void engine() {
			System.out.println(" car ------- engine");
		}
		
		//@Override	
		public static final void display() {
			System.out.println("car ---display");
		}
	
		public final void running() {
			System.out.println("car ---running");
		}
		
		public  void payment(String cc, int ccv) {
			System.out.println("car payment  using: +cc"+ ":" +ccv  );
			

		}	
		public  void payment(String upi) {
			System.out.println("car payment using :"   +upi);

}
}


