package nyp10c;

/* Example of using a primitive key that is automatically transformed 
 * to its Wrapper (auto-boxing in Java terminology).
 * */
public class Student {
	private int number;
	private String name;

	public Student(int no, String name) {
		this.number = no;
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	
	/*//gereksiz PreTypeCasting �rne�i i�in ek.
	public String toString( ) {
		return number + " " + name;
	}
	*/
	
}
