package Chapter6;

public class InstanceofTest {
	public static void main(String[] args) {
		President1 president1 = new President1();
		Person1 person1 = president1;
		
		if(person1 instanceof President1) {
			President1 president2 = (President1)person1;
			System.out.println("person1을 President1 타입으로 캐스팅 성공.");
		}else {
			System.out.println("person1을 캐스팅 할 수 없다.");
		}
		//Person1객체 생성
		Person1 person2 = new Person1();
		
		if(person2 instanceof President1) {
			President1 president3 = (President1)person2;
			System.out.println("person2을 President1 타입으로 캐스팅 성공");
		}else {
			System.out.println("person2를 캐스팅할 수 없다.");
		}
	}
}

