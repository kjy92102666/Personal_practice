package controller;

import java.util.Scanner;
import action.Action;

//클라이언트의 전체 요청을 제어하는 클래스.
public class MemberController {
	public void processRequest(Scanner scan, Action action) {
		try {
			action.execute(scan);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
