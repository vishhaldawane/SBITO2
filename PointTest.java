
public class PointTest {
	public static void main(String[] args) {
		Point2D p1 = new Point2D(100,200,"Red");
	//	p1.setPoint2D(100, 200);
	//	p1.setColor("Green");
		p1.showPoint2D();
		
		System.out.println("-------------------------");
		
		Point3D p2 = new Point3D(50,60,"green",66);
	//	p2.setPoint3D(10,20,30);
	//	p2.setColor("Yellow");
		p2.showPoint3D();
		
		System.out.println("-------------------------");
		
		Point4D p3 = new Point4D(11,22,"Yellow",67,90);
	//	p3.setPoint4D(70,80,60,40);
	//	p3.setColor("Red");
		p3.showPoint4D();
		
		
	}
}

class Point2D
{
	int x;
	int y;
	String color;
	
	
	
	public Point2D(int x, int y, String color) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
	}
	public void setPoint2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void setColor(String col) {
		color =col;
	}
	
	void showPoint2D() {
		System.out.println("x "+x);
		System.out.println("y "+y);
		System.out.println("Color "+color);
	}
}
class Point3D extends Point2D
{
	int z;
	
	
	public Point3D(int x, int y, String color, int z) {
		super(x, y, color);
		this.z = z;
	}

	public void setPoint3D(int x, int y, int z) {
		super.setPoint2D(x, y);
		this.z = z;
	}
	
	void showPoint3D() {
		super.showPoint2D();
		System.out.println("z "+z);
	}
}
class Point4D extends Point3D
{
	int f;
	
			
			
	public Point4D(int x, int y, String color, int z, int f) {
		super(x, y, color, z);
		this.f = f;
	}

	public void setPoint4D(int x, int y, int z, int f) {
		super.setPoint3D(x, y, z);
		this.f = f;
	}
	
	void showPoint4D() {
		super.showPoint3D();
		System.out.println("f "+f);
	}
	
}
