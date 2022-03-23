
public class ClassExtensionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Doctor d = new Doctor();
//		d.setDoctor("MBBS", 500);
//		System.out.println("d "+d);
//		d.diagnose();
		
		System.out.println("=====================");
		
		Surgeon s = new Surgeon();
//		s.setSurgeon("MBBS", 1500, "MS");
//		System.out.println("s "+s);
//		s.diagnose();
//		
//		s.doSurgery();
		
		System.out.println("=====================");
		
		HeartSurgeon  hs = new HeartSurgeon();
//		hs.setHeartSurgeon("MBBS", 6000, "MS", "MHS");
//		hs.diagnose();
//		System.out.println("hs "+hs);
//		hs.doHeartSurgery();
//	
		
		
		if( d instanceof Doctor) {
			System.out.println("yes d is a doctors instance...");
		}
		else {
			System.out.println("NO, d is NOT a doctors instance...");
		}
		System.out.println("=========================");
		
		if( s instanceof Doctor) {
			System.out.println("yes s is a doctors instance...");
		}
		else {
			System.out.println("NO, s is NOT a doctors instance...");
		}
		System.out.println("-----------------");
		
		if( s instanceof Surgeon) {
			System.out.println("yes s is a Surgeon's instance...");
		}
		else {
			System.out.println("NO, s is NOT a Surgeon's instance...");
		}
		
		System.out.println("=========================");
		
		if( hs instanceof Doctor) {
			System.out.println("yes hs is a doctors instance...");
		}
		else {
			System.out.println("NO, hs is NOT a doctors instance...");
		}
		System.out.println("-----------------");
		
		if( hs instanceof Surgeon) {
			System.out.println("yes hs is a Surgeon's instance...");
		}
		else {
			System.out.println("NO, hs is NOT a Surgeon's instance...");
		}
		System.out.println("-----------------");
		
		if( hs instanceof HeartSurgeon) {
			System.out.println("yes hs is a HeartSurgeon's instance...");
		}
		else {
			System.out.println("NO, hs is NOT a HeartSurgeon's instance...");
		}
	}

}
/*
 * 
 * 						Object
 * 						|	w,w,w,n,na, eq,hash, fina, toSt,clone,getClass,
 * 						|
 * 						Doctor		
 * 						| qual, fees, diagnose(), setDoctor, toString()
 * 			----------------------------
 * 			|
 * 		Surgeon
 * 		|ssqual, 
 * 		|
 * 	HeartSurgeon
 * 	hsQual, 
 * 
 * 
 */
class Doctor // Developer : mamta
{
	String qualification;
	float fees;
	
	public void setDoctor(String qualification, float fees) {
		this.qualification = qualification;
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Doctor [qualification=" + qualification + ", fees=" + fees + "]";
	}
	
	void diagnose() { //overridden
		System.out.println("Doctor is diagnosing.... EENTT");
	}
}

class Surgeon extends Doctor //Developer : Shashi Bamne
{
	String specializedQualification;
	
	public void setSurgeon(String qualification, float fees, String specializedQualification) {
		super.setDoctor(specializedQualification, fees);
		this.specializedQualification = specializedQualification;
	}
	
	void diagnose() { //over-riding 
		super.diagnose();
		System.out.println("Surgeon is diagnosing.... CT Scan");
	}

	@Override
	public String toString() {
		return "Surgeon [specializedQualification=" + specializedQualification + ", toString()=" + super.toString()
				+ "]";
	}
	void doSurgery() {
		doCut();
		System.out.println("Surgeon is doing general surgery...");
		doStitching();
	}
	
	private void doCut() {
		System.out.println("Surgeon is cutting.......");
	}
	private void doStitching() {
		System.out.println("Surgeon is stitching.......");
	}

	
}

class HeartSurgeon extends Surgeon
{
	String heartSurgeySpecialization;

	public void setHeartSurgeon(String qualification, float fees, String specializedQualification, String heartSurgeySpecialization) {
		super.setSurgeon(qualification, fees, specializedQualification);
		this.heartSurgeySpecialization = heartSurgeySpecialization;
	}
	
	void diagnose() { //over-riding 
		super.diagnose();
		System.out.println("HeartSurgeon is diagnosing.... ECG Scan");
	}
	void doHeartSurgery() {
		doCut();
		System.out.println("HeartSurgeon is doing Heart surgery...");
		doStitching();
	}
	
	private void doCut() {
		System.out.println("HeartSurgeon is cutting...at the heart area....");
	}
	private void doStitching() {
		System.out.println("HeartSurgeon is stitching..at the heart area.....");
	}

	@Override
	public String toString() {
		return "HeartSurgeon [heartSurgeySpecialization=" + heartSurgeySpecialization + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
/*
class Surgeon 
{
	String qualification;
	float fees;
	String specializedQualification;//SPECIAL
	
	public void setSurgeon(String qualification, float fees, String specializedQualification) {
		this.qualification = qualification;
		this.fees = fees;
		this.specializedQualification = specializedQualification;
	}
	
	void diagnose() {
		System.out.println("Surgeon is diagnosing.... EENTT");
		System.out.println("Surgeon is diagnosing..the CT scan.."); //SPECIAL
	}

	@Override
	public String toString() {
		return "Surgeon [qualification=" + qualification + ", fees=" + fees + ", specializedQualification="
				+ specializedQualification + "]";
	}
	
	void doSurgery() {
		doCut();
		System.out.println("Surgeon is doing general surgery...");
		doStitching();
	}
	
	private void doCut() {
		System.out.println("Surgeon is cutting.......");
	}
	private void doStitching() {
		System.out.println("Surgeon is stitching.......");
	}
}


class HeartSurgeon 
{
	String qualification;
	float fees;
	String specializedQualification; 
	String heartSurgeySpecialization; //SPECIAL//SPECIAL
	
	public void setHeartSurgeon(String qualification, float fees, String specializedQualification,
			String heartSurgeySpecialization) {
		this.qualification = qualification;
		this.fees = fees;
		this.specializedQualification = specializedQualification;
		this.heartSurgeySpecialization = heartSurgeySpecialization;
	}

	void diagnose() {
		System.out.println("HeartSurgeon is diagnosing.... EENTT");
		System.out.println("HeartSurgeon is diagnosing..the CT scan..");
		System.out.println("HeartSurgeon is diagnosing..the ECG scan..");
		System.out.println("HeartSurgeon is diagnosing..the 2D ECHO scan..");
	}

	@Override
	public String toString() {
		return "HeartSurgeon [qualification=" + qualification + ", fees=" + fees + ", specializedQualification="
				+ specializedQualification + ", heartSurgeySpecialization=" + heartSurgeySpecialization + "]";
	}

	void doHeartSurgery() {
		doCut();
		System.out.println("HeartSurgeon is doing Heart surgery...");
		doStitching();
	}
	
	private void doCut() {
		System.out.println("Surgeon is cutting....at the Heart Area...");
	}
	private void doStitching() {
		System.out.println("Surgeon is stitching....at the Heart Area...");
	}

}
*/
