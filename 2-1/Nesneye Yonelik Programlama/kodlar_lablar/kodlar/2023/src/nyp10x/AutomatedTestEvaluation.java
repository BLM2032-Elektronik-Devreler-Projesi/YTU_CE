package nyp10x;

import static org.junit.Assert.*;
import org.junit.*;

public class AutomatedTestEvaluation {
	private Course oop;
	private Student yasar, cemalnur, fatih, yunus;

	@Before
	public void setUp() throws Exception {
		oop = new Course("0112562", "Obj. Or. Prog.", 3);
		yasar = new Student("09011034","Ya�ar Nuri �zt�rk");
		fatih = new Student("09011046","Fatih ��tlak");
		cemalnur = new Student("09011047","Cemalnur Sargut");
		yunus = new Student("09011045","Yunus Emre Sel�uk");
	}
	
	public void populateCourse( ) throws Exception {
		setUp();
		oop.addStudent(yasar);
		oop.addStudent(cemalnur);
		oop.addStudent(fatih);
	}

	@Test
	public void testAddingFirstStudent() {
		assertTrue(oop.addStudent(yasar));
	}

	@Test
	public void testAddingSameStudentTwice() {
		oop.addStudent(yasar);
		assertFalse(oop.addStudent(yasar));
	}

	@Test
	public void testAddingStudentWhenCapacityIsFull() throws Exception {
		populateCourse();
		assertFalse(oop.addStudent(yunus));
	}

	@Test
	public void testFindingStudents() throws Exception {
		populateCourse();
		assertEquals(oop.findStudent("09011046"), fatih);
		assertNotNull(oop.findStudent(fatih.getNumber()));
	}
	@Test
	public void testIncreasingCapacityAndAddingNewStudent() throws Exception {
		populateCourse();
		oop.increaseCapacity(4);
		assertTrue(oop.addStudent(yunus));
	}
}
