package Chapter6;

public class ArrayPolyTest {
	public static void main(String[] args) {
		Person2[] pArray = new Person2[3];
		pArray[0] = new Salaryman2();
		pArray[1] = new Student2();
		pArray[2] = new President2();
		
		for(int i=0; i<pArray.length; i++) {
			pArray[i].sleep();
		}
	}
}
