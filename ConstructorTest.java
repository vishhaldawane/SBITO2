/*
 * 
 * 			stack					heap
 * 
 * 
 * 																	lensId	lensBrand	lensType;
 * 																	-------------------------------
 * 																	|123	|"Canon"	|"EF 50mm"	|
 * 																	-------------------------------
 * 																	200					zoomIn(), zoomOut();
 * 																	|
 * 																	+--------
 * 																			|
 * 							cameraId	cameraBrand		megaPixel	cost	lens
 * 							------------------------------------------------------
 * 							|5543	|"Canon EOS 1500"	| 34	| 36000	|   200	|
 * 							------------------------------------------------------
 * 			-----------------100
 * 			|								printCameraDetails() { lens.printLensDetails() }
 * 			100								click() { len.zoomIn() }						
 * 			cam1
 * 
 */
public class ConstructorTest {

	public static void main(String[] args) {
		
				System.out.println("Begin");
		
				Camera cam1 = new Camera(5543, "Canon EOS 1500", 34, 36000,123,"Canon","EF 50mm");
				Camera cam2 = new Camera(5544, "Sony Cyber Shot DSE", 30, 34000,124,"Sony ","EF 200mm");
				Camera cam3 = new Camera(5545, "Nikon CoolPix", 25, 26000,125,"Nikon","APF 18-55mm");
				
				cam1.printCameraDetails();
				cam2.printCameraDetails();
				cam3.printCameraDetails();
				
				cam3.click();
				
		
		}

}

class Camera
{
	int cameraId;
	String cameraBrand;
	int megaPixel; // in M
	float cost;
	Lens lens;
	
	
	public Camera(int cameraId, String cameraBrand, int megaPixel, float cost, int lid, String lb,String lt) {
		super();
		this.cameraId = cameraId;
		this.cameraBrand = cameraBrand;
		this.megaPixel = megaPixel;
		this.cost = cost;
		this.lens = new Lens(lid,lb,lt);
	}

	void printCameraDetails() {
		System.out.println("Camera Id    : "+cameraId);
		System.out.println("Camera Brand : "+cameraBrand);
		System.out.println("Camera MP    : "+megaPixel);
		System.out.println("Camera Cost  : "+cost);
		lens.printLensDetails();
		System.out.println("-----------------------------------");
	} 
	
	void click() {
		lens.zoomIn();
		lens.zoomOut();
		System.out.println("clicking.....");
	}
}


class Lens
{
	int lensId;
	String lensBrand;
	String lensType;
	
	
	
	public Lens(int lensId, String lensBrand, String lensType) {
		super();
		this.lensId = lensId;
		this.lensBrand = lensBrand;
		this.lensType = lensType;
	}
	
	
	public int getLensId() {
		return lensId;
	}


	public void setLensId(int lensId) {
		this.lensId = lensId;
	}


	public String getLensBrand() {
		return lensBrand;
	}


	public void setLensBrand(String lensBrand) {
		this.lensBrand = lensBrand;
	}


	public String getLensType() {
		return lensType;
	}


	public void setLensType(String lensType) {
		this.lensType = lensType;
	}


	void zoomIn() {
		System.out.println("Zoom in..."+lensType);
	}
	void zoomOut() {
		System.out.println("Zoom out..."+lensType);
	}
	
	void printLensDetails() {
		System.out.println("lend id    : "+lensId);
		System.out.println("lend Brand : "+lensBrand);
		System.out.println("lend Type  : "+lensType);
	}
}


/*
				Association
				isA		hasA		usesA		producesA
		
		isA - aggregation	
		
		class Person
		{
			gender age name
			PanCard p = new PanCard(); //hasA
			AdhaarCard ac = new AdhaarCard();
			PassPort p = new Passport();
			
		}
		
		class Student extends Person
		{
			rollno, 
			ReportCard rpt1 = new ReportCard();
			ReportCard rpt2 = new ReportCard();
			
			ReportCard rpt3 = new ReportCard();
			ReportCard rpt4 = new ReportCard();
			
			ReportCard rpt5 = new ReportCard();
			ReportCard rpt6 = new ReportCard();
			
			
		}
		
		class Employee extends Student
		{
			empno, 
			SalarySlip jan2022 = new SalarySlip();
			SalarySlip feb2022 = new SalarySlip();
			SalarySlip mar2022 = new SalarySlip();
			
			
		}
			
			
		hasA - composition

		class Filament
		{
		
		}
		
		class Bulb <--WHOLE entity
		{
			Filament fila = new Filament(); //hasA <-- PART entity
			
		}
		
		
		class Heart
		{
		
		}
		
		class Animal
		{
		
		}


	class Wheel
	{
	
	}
	class Car  <--WHOLE
	{
		Wheel w1 = new Wheel(); //parts
		Wheel w2 = new Wheel(); //parts
		Wheel w3 = new Wheel(); //parts
		Wheel w4 = new Wheel(); //parts
		Engine e = new Engine(); //parts
		
		void drive() {
		
		}
	}

	class Machine
	{
	}
	
	
	class WashingMachine extends Machine //isA
	{
			WashingTub wt = new WashingTub(); //hasA
			
			
			producesA			usesA		usesA		usesA		usesA
			Laundry wash(WashingPowder wp, Water w, Electricity e, Cloth c[] )
			{
			
				Laundry laundry = new Laundry(.....);
				return laundry; 
			}
	}
*/