package com.simple.ex;

public class Member {
	private int id; 		//식별번호
	private String name;
	private String email;
	private String addr;
	private int age;
	//private String hobby;
	//private String tel;
//	public Member() {
//		// TODO Auto-generated constructor stub
//	}
	
	public Member() {
		
	}
	
	public Member(int id, String name, int age, String email, String addr) {
		//super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.addr = addr;
		this.age = age;
		//return id+name+age+email+addr;
	}
	
//
	public int getId() { return id;	}
	public void setId(int id) {	this.id = id; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	
	public String getAddr() { return addr; }
	public void setAddr(String addr) { this.addr = addr; }
	
	
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
//	
//	public String getHobby() { return hobby; }
//	public void setHobby(String hobby) { this.hobby = hobby;	}
//	
//	public String getTel() { return tel; }
//	public void setTel(String tel) { this.tel = tel;	}
	
	
	public String showInfo() {
//		System.out.println("회원 아이디 : " + id + ", 이름 : " + name + ", 이메일 : " + email+ 
//				", 주소 : " + addr + ", 나이 : " + age + "\n");
		return "회원 아이디 : " + id + ", 이름 : " + name + ", 이메일 : " + email+ 
				", 주소 : " + addr + ", 나이 : " + age + "\n";

	}
	
	@Override
	public String toString() {
		return "회원 아이디 : " + id + ", 이름 : " + name + ", 이메일 : " + email+ 
			", 주소 : " + addr + ", 나이 : " + age + "\n";
	}
	//+ ", 취미 : " + hobby + ", 전화번호 : " + tel 
	
	
}
