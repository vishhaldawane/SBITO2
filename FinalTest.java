
public class FinalTest {
	public static void main(String[] args) {
		
		
		final float PI=3.14f;
		
		System.out.println("PI "+PI);
		
		//PI=3.18f;
		
		System.out.println("PI "+PI);
		
		final float SPEED_OF_LIGHT=186000.519f;
		
		GraphicalChess  gc = new GraphicalChess();
		gc.moveBishop();
	}
}

class Chess //Shashi Bamne
{
	final int TOTAL_SQUARES=64;
	final int WHITE_PAWN_COUNT=8;
	final int BLACK_PAWN_COUNT=8;
	
	void moveBishop() //camel move to calculated the checkmate
	{
		System.out.println("moving the bishop diagonally bi-directionally...");
	}
	
}

final class GraphicalChess extends Chess
{
	void moveBishop() {
		super.moveBishop();
		System.out.println("graphical move of bishop is done..too");
	}
}









/*
 
1 	R	K	B	K	Q	B	K	R
2 	P	P	P	P	P	P	P	P
3 	
4
5
6 	
7 	P	P	P	P	P	P	P	P
8 	R	K	B	K	Q	B	K	R
  	1	2	3	4	5	6	7	8
  	
  
  
  
 */

