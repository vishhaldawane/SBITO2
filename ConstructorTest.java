
public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("");
		Camera  cam1 = new Camera(10);
		Camera  cam2 = new Camera(20);
		Camera  cam3 = new Camera(30);
		
		cam1.setCamera(10);
		cam1.setCamera(20);
		cam1.setCamera(30);
		
		cam2.setCamera(20);
		cam3.setCamera(30);
		
	}

}

class Camera
{
	int cameraId;
	String cameraBrand;
	int megaPixel; // in M
	float cost;

	Camera(int megaPixel) {
		System.out.println("Camera is constructed...");
		this.megaPixel= megaPixel;
	}
	
		
	void setCamera(int megaPixel) {
		System.out.println("Camera is constructed...");
		this.megaPixel= megaPixel;
	}
	
	Photo click(Scene s ) {
		
	}
	
}