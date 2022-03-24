
public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kite.showKiteCount();
		
		Kite k1 = new Kite("Red","Veni",40);
		Kite k2 = new Kite("Green","Poornima",50);
		Kite k3 = new Kite("Yellow","Mamta",60);

		Kite.showKiteCount();

		
		System.out.println("k1 "+k1);
		System.out.println("k2 "+k2);
		System.out.println("k3 "+k3);
		
		Kite k4 = new Kite("Black","Mayur",45);
		Kite k5 = new Kite("White","Shashi Bamne",65);
		
		Kite.showKiteCount();
		System.out.println("k4 "+k4);
		System.out.println("k5 "+k5);
		
		
		k5.kiteFight(k4);
		
		
		Kite.showKiteCount();
	}

}

class Kite
{
	private static int kiteCount; // class's data
	
	public static void showKiteCount() {
		System.out.println("Total kites in the sky : "+kiteCount);
	}
	
	private String color; //object's data
	private String owner; //object's data
	private int length;   //object's data
	private boolean flying;
	
	void kiteFight(Kite x)  {
		System.out.println(color+" color Kite initiated a kite fight with "+x.color+" color Kite");
		for(int i=1;i<=10;i++) {
			System.out.println("Kite fight is going..on..."+i);
			double val = Math.random()%10;
			//System.out.println("val "+val);
			if(val > 0.98) {
				System.out.println(x.color+" color kite is down");
				x.flying=false;
				kiteCount--;
				break;
			}
			else if(val < 0.10) {
				System.out.println(color+" color kite is down");
				flying=false;
				kiteCount--;
				break;
			} 
			else if ( val >= 0.50 && val<=0.60) {
				System.out.println(x.color+" color kite is down");
				System.out.println(color+" color kite is down");
				x.flying=false;
				kiteCount--;
				flying=false;
				kiteCount--;
				break;
			}
			
		}
	}
	
	
	public Kite(String color, String owner, int length) {
		super();
		System.out.println("Kite constructor....");
		this.color = color;
		this.owner = owner;
		this.length = length;
		this.flying = true;
		
		++kiteCount;
	}

	void fly() {
		System.out.println(color+" color kite is flying....by "+owner);
		flying=true;
	}

	



	@Override
	public String toString() {
		return "Kite [color=" + color + ", owner=" + owner + ", length=" + length + ", flying=" + flying + "]";
	}

	
	
}