package practiceex01;

public class UesrTest {
	public static void main(String[] args) {
		UserInfoWeb oracle = new oracleDao();
		oracle.setusername("±è¹Î");
		
		((oracleDao) oracle).insert();
		oracle.showusername();
	}
}


