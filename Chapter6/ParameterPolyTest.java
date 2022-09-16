package Chapter6;

class PersonInfo{
	void showSleepingType(Person2 person) {
		person.sleep();
	}
}

public class ParameterPolyTest {
	public static void main(String[] args) {
		/*
		   Parameter 다형성 테스트 
		 */
		PersonInfo pf = new PersonInfo();
		Person2 person = new Person2();
		Salaryman2 salaryman = new Salaryman2();
		Student2 student = new Student2();
		President2 president = new President2();
		
		pf.showSleepingType(person);
		pf.showSleepingType(salaryman);
		pf.showSleepingType(student);
		pf.showSleepingType(president);
	}
}
