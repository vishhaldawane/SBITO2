public class Test {
	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.roar();  t.hunt("deer");
		int c = t.jump(7, 8); System.out.println("Tiger covered.."+c+" feet area");
		int s = t.swimming(); System.out.println("Tiger swam : "+s+" meters");
	}
}
class Tiger
{
	void roar() {
		System.out.println("Tiger is roaring..");
	}
	void hunt(String theHuntedAnimal) {
		System.out.println("Tiger is hunting...."+theHuntedAnimal);
	}
	int jump(int length, int height) {
		System.out.println("Tiger is jumping...");
		int cover = length * height;
		return cover;
	}
	int swimming() {
		System.out.println("Tiger is swimming...10 meters");
		return 10;
	}
}