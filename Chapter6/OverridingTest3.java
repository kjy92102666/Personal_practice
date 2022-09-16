package Chapter6;

public class OverridingTest3 {
	public static void main(String[] args) {
		Salaryman2 salaryman = new Salaryman2();
		Person2 person = salaryman;
		
		System.out.println("salaryman.x = " + salaryman.x);
		System.out.println("person.x = " + person.x);
		
		salaryman.sleep();
		person.sleep();
	}
}
