package action;

import java.util.Scanner;
//각 요청을 처리하는 Action 클래스 객체들의 형태를 정의한 인터페이스
public interface Action {
	void execute(Scanner scan) throws Exception;
}
