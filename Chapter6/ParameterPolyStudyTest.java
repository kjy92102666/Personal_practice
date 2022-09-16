package Chapter6;

class PersonInfo2{
	void showSleepingType (Person2 person) {
		if(person instanceof Student2) {	//instanceOf 연산자는 객체가 어떤 클래스인지, 어떤 클래스를 상속받았는지 확인하는데 사용하는 연산자
			Student2 student = (Student2)person;
			student.study();
		}
		person.sleep();
	}
}

public class ParameterPolyStudyTest {
	//다형성 테스트
	public static void main(String[] args) {
		PersonInfo2 pf = new PersonInfo2();
		Person2 person = new Person2();				//사람은 보통 10시간 잔다.
		Salaryman2 salaryman = new Salaryman2();	//직장인은 일반적으로 7시간을 잔다.
		Student2 student = new Student2();			//학생들의 수면 스타일은 규칙적이다.
		President2 president = new President2();	//대통령은 항상 수면 시간이 부족하다.
		
		pf.showSleepingType(person);
		pf.showSleepingType(salaryman);
		pf.showSleepingType(student);
		pf.showSleepingType(president);
	}
}
