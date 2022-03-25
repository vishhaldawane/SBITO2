
public class InstrumentTest {

	public static void main(String[] args) {
		
	}

}

abstract class Instrument
{
	abstract void use();
}

abstract class MusicalInstrument extends Instrument
{
	abstract void play();
}

abstract class StringBasedMusicalInstrument extends  MusicalInstrument
{
	abstract void tuneStrings();
}

class Guitar extends StringBasedMusicalInstrument
{
	void tuneStrings() {
		System.out.println("Tuning Guitar strings...");
	}

	void play() {
		System.out.println("Playing Guitar ...");
	}
	
	void use() {
		System.out.println("Using Guitar ...");
	}
}

class Violin extends StringBasedMusicalInstrument
{
	void tuneStrings() {
		System.out.println("Tuning Violin strings...");
	}

	void play() {
		System.out.println("Playing Violin ...");
	}
	
	void use() {
		System.out.println("Using Violin ...");
	}
}

/*
 * 
 Framework = semi-developed 
 
1  							Instrument
  								|use();
  			-----------------------------------------------
  			|											|													
 2 	MusicalInstrument									MedicalInstrument
  			|	play();												|operate();
  	----------------------------------------			-----------------------------
  	|				|					|					|					|
 3 StringBased		AirBased			DrumBased		  Surgical 			Pathological
 MusicalInstruent   MusicalInstruent    MusicalInstruent  MedicalInstrument MedicalInstrument
   |tuneStrings(); 		|cleanAir()			|tuneSurface();		|sterilize();	|readIt();
-----------------	---------		---------------		----------------	------------  
  |		   |		|		|			|		|		|		|			|		|
4 Guitar Violin  	Flute  SaxoPhone	Tabla	Duff	Cutter  Needle  ECGMachine GlucoMeter
  |			 |
Electronic Cello
Guitar
  
  layer 1 - tables
  layer 2 - pojo - class SavingsAccount { acno ,name, balance,  }
  layer 3 - class SavingsAccountRepository
  
  layer 4
  layer 5
  layer 6
  
 */


