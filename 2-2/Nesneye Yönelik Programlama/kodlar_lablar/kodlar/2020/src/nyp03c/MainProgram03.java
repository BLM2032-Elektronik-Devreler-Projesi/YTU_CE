package nyp03c;

public class MainProgram03 {

	public static void main(String[] args) {
		Person oktay = new Person("Oktay Sinano�lu");
		Car rover = new Car("06 OS 1934", oktay);
		System.out.println( oktay.introduceSelf() );
		System.out.println( rover.introduceSelf() );
	}

}
