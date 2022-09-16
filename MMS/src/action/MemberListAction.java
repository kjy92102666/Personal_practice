package action;

import java.util.Scanner;
import svc.MemberListService;
import util.ConsoleUtil;
import vo.Member;

//회원 목록 보기 요청을 처리하는 Action클래스.
public class MemberListAction implements Action{

	@Override
	public void execute(Scanner scan) {
		ConsoleUtil consoleUtil = new ConsoleUtil();
		MemberListService memberListService = new MemberListService();
		Member[] memberArray = memberListService.getMemberArray();//배열을 가져온다.
		consoleUtil.printMemberList(memberArray);
	}
	
}
