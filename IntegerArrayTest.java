/*
 * 
 * 
 * Defn of an array
 * 
 * 		- group of variables
 * 		- of similar types
 * 		- stored in consecutive memory location
 * 		- referred by a common name
 * 		- fixed width/length
 * 		- cannot grow at runtime
 */
public class IntegerArrayTest {
	public static void main(String[] args) {
		 
					  //0   1   2  3
		int indScore[]= {100,110,150,80};
		
		/*
		 
		 	+---------------+---------------+---------------+---------------+---------------+---------------+---------------+
		 	|	|	|	|	|	|	|	|	|	|	|	|	|	|	|	|	|				|				|				|
		 	|	100      	|  202			|	20			|	20			|	75			|	80			|				|
		 	|	|	|	|	|				|				|				|				|				|				|
		 	+---------------+---------------+---------------+---------------+---------------+---------------+---------------+
		 	50   51  52  53  54				 58			     62				 66				 70
		 	|				 |
		  
		  
		  
		 */
		
		int ausScore[]= new int [ 11 ];
		
		ausScore[0]=100;
		ausScore[1]=202;
		ausScore[2]=20;
		ausScore[3]=10;
		ausScore[4]=75; 
		ausScore[5]=80;
		
		//formula - ausScore[5]
		// * ( base address of array + (size of type * index ) )
		// * ( base address of array + (size of type * 5 ) )
		// * (50 +                     ( 4 * 5)
		// 50 + 20 
		// 70
		
		
		System.out.println("array of 4 is "+ausScore[4]);
		
		/*
		int indScoreTotal=0;
		int ausScoreTotal=0;
		
		for(int i=0;i<indScore.length;i++) {
			System.out.println("indScore  :" +indScore[i]);
			indScoreTotal = indScoreTotal + indScore[i];
		}
		
		System.out.println("Indian score : "+indScoreTotal);
		
		System.out.println("trying to set 5th value in indScore....");
		try {
			indScore[7]=99;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index is wrong...");
		}
		
		System.out.println("--------------------");
		
		for(int i=0;i<ausScore.length;i++) {
			System.out.println("ausScore  :" +ausScore[i]);
			ausScoreTotal = ausScoreTotal + ausScore[i];
		} 
		
		System.out.println("Aus score : "+ausScoreTotal);
		*/
	}
}
