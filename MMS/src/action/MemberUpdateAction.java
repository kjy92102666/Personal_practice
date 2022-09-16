package action;

import java.util.Scanner;
import svc.MemberUpdateService;
import util.ConsoleUtil;
import vo.Member;

//회원 정보 수정 요청을 처리하는 Action클래스
public class MemberUpdateAction implements Action{
	
	@Override
	public void execute(Scanner scan) {
		
		ConsoleUtil consoleUtil = new ConsoleUtil();
		int id = consoleUtil.getId("수정할", scan);
		MemberUpdateService memberUpdateService = new MemberUpdateService();
		Member oldMember = memberUpdateService.getOldMember(id);
		Member newMember = consoleUtil.getNewMember(oldMember, scan);
		boolean updateSuccess = memberUpdateService.updateMember(newMember);
		if(updateSuccess) {
			consoleUtil.printUpdateSuccessMessage(newMember.getId());
		}else {
			consoleUtil.printUpdateFailMessage(newMember.getId());
		}
	}
	
}