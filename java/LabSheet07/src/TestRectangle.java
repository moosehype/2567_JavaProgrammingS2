
public class TestRectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		System.out.println(r1.showData());
		Spacing();
		System.out.println("Displays Data using toString() method");
		System.out.println(r1);
		Spacing();
		Rectangle r2 = new Rectangle (1.2f,3.4f);
		System.out.println(r2);
		
		r1.setLength(5.6f);
		r1.setWidth(7.8f);
		System.out.println(r1);
		System.out.println("Length is "+r1.getLength());
		System.out.println("width is "+r1.getWidth());
		Spacing();
		System.out.printf("area is %.2fn", r1.getArea());
		System.out.printf("Perimeter is %.2fn", r1.getWidth());
		Spacing();
		System.out.printf("area is %.2fn", r2.getArea());
		System.out.printf("Perimeter is %.2fn", r2.getWidth());
	}

	public static void Spacing() {
		System.out.println();
		
	}

}
