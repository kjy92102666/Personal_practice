package Chapter6;

public class InstanceofTest {
	public static void main(String[] args) {
		President1 president1 = new President1();
		Person1 person1 = president1;
		
		if(person1 instanceof President1) {
			President1 president2 = (President1)person1;
			System.out.println("person1�� President1 Ÿ������ ĳ���� ����.");
		}else {
			System.out.println("person1�� ĳ���� �� �� ����.");
		}
		//Person1��ü ����
		Person1 person2 = new Person1();
		
		if(person2 instanceof President1) {
			President1 president3 = (President1)person2;
			System.out.println("person2�� President1 Ÿ������ ĳ���� ����");
		}else {
			System.out.println("person2�� ĳ������ �� ����.");
		}
	}
}

