package practiceex01;
import java.util.ArrayList;

public class UserInfoWeb {
	private String username="";
	
	protected ArrayList <String>userlist = new ArrayList<>();
	UserInfoWeb(){}
	
	String setusername(String username){
		this.username = username;
		return username;
	}
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}



	void showusername() {
		System.out.println("����� ���� �̸��� " +getUsername() + "�Դϴ�.");
	}
	

}

	
