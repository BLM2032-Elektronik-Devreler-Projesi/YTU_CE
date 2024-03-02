package nyp10c;
import java.util.*;

/* Object i�eren eski generic olmayan veri yap�lar� kullan�m �rne�i.
 * Ek soru geldi�i i�in yapt�m, yoksa anlatmaya gerek yok.
 * Typecasting obsession �rne�i olarak belki verilebilir, yine soru gelirse.
 * */
public class PreTypeCasting {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Course oop = new Course("0112562", "Obj. Or. Prog.", 30);
		Student yasar = new Student(9011034,"Ya�ar Nuri �zt�rk");
		Student yunus = new Student(9011045,"Yunus Emre Sel�uk");
		Student fatih = new Student(9011046,"Fatih ��tlak");
		list.add(oop);
		list.add(yasar);
		list.add(yunus);
		list.add(fatih);
		for( Object iter : list ) {
			System.out.println(iter);
		}
		for( Object iter : list ) {
			if( iter instanceof Course ) {
				Course c = (Course)iter;
				c.addStudent(new Student(111111,"Ahmet �al��kan"));
			}
			else if( iter instanceof Student ) {
				Student std = (Student)iter;
				oop.addStudent(std);
			}
		}
		oop.showClassList();
		

	}

}
