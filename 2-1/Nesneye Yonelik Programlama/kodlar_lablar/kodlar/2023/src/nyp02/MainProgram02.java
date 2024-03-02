package nyp02;
import java.util.*;
public class MainProgram02 {

	public static void main(String[] args) {
		Scanner gir = new Scanner(System.in);
		Person oktay;
		String str="";
		while( str.length() < 5 ) {
			System.out.print("Ki�i ismi girin: ");
			str = gir.nextLine();
		}
		oktay = new Person( str );
		System.out.print("Ki�inin arabas� var m� (e/h)");
		String secim = gir.nextLine();
		if( secim.contains("e") || secim.contains("E") ) {
			System.out.print("Arac�n plakas�n� gir");
			Car rover = new Car( gir.nextLine() );
			oktay.setCar( rover );
		}
		System.out.println( oktay.introduceSelf() );
		gir.close();
	}

}
