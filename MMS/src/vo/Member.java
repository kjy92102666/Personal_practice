package vo;

//회원 정보를 담는 클래스
public class Member {
	//toString() 객체의 정보를 문자열로 반환해 주는 메소드
	//Object에서 제공되는 기본방식은 클래스 이름 + @ + 해시코드값으로 정볼를 반환
	
	private int id; //식별자
	private String name;
	private String email;
	private String addr;
	private String hobby;
	private String tel;
	private int age;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "회원 아이디 : " + id + ", 이름 : " + name + ", 이메일 : " + email+ ", 주소 : "
				+ addr + ", 취미 : " + hobby + ", 전화번호 : " + tel + ", 나이 : " + age;
	}
	
}
