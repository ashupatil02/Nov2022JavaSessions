package Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		
		fh.cardioServices();
		fh.neuroServices();
		fh.physioServices();
		fh.entServices();
		fh.dentalServices();
		fh.oncologyServices();
		
		fh.emergencyServices();
		
		fh.medicalInsurance();
		fh.medicalTraining();
		fh.medicalRD();
		fh.medicalNews();
		fh.covidVaccination();
		fh.pandemicPolicy();
		System.out.println(FortisHospital.min_fee);
		System.out.println(USMedical.min_fee);
	//	System.out.println(fh.min_fee);
		
		USMedical.taxCalculation();
		
		fh.getMedicalServices();
		
		
		
//		//NA
//		USMedical us = new USMedical();
//		
//		//top casting:
//		//child class object can be referred by parent interface ref variable
//	
		System.out.println("-------------------------");
		USMedical us = new FortisHospital();
		us.cardioServices();
		us.neuroServices();
		us.physioServices();
		us.emergencyServices();
//		
		System.out.println("-------------------------");
  	    UKMedical uk = new FortisHospital();
		uk.dentalServices();
		uk.entServices();
		uk.emergencyServices();

		System.out.println("-------------------------");
		IdianMedical in = new FortisHospital();
		in.orthoServices();
		in.oncologyServices();
		in.gynicServices();
		in.emergencyServices();
		
		
		System.out.println("-------------------------");
//		//down casting? at the compile time?
	//	FortisHospital fh1 = new USMedical();
//		
//		
//		//use constants:
		System.out.println(Constants.OK_MESSG_200);
		System.out.println(Constants.DEFAULT_TIME_OUT);
//		
//
//		
//		
//		
//	}
//
//}
}
}
