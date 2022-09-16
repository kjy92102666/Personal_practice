package action;

import java.util.Scanner;
import svc.MemberDeleteService;
import util.ConsoleUtil;

//회원정보 삭제요청 처리 클래스
public class MemberDeleteAction implements Action{
	ConsoleUtil consoleUtil = new ConsoleUtil();
	
	@Override
	public void execute(Scanner scan) throws Exception{
		int id = consoleUtil.getId("삭제할 ", scan);
		MemberDeleteService memberDeleteService = new MemberDeleteService();
		boolean deleteSuccess = memberDeleteService.deleteMember(id);
		
		if(deleteSuccess) {
			consoleUtil.printDeleteSuccessMessage(id);
		}else {
			consoleUtil.printDeleteFailMessage(id);
		}
	}
}
