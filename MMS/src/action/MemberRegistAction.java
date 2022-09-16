package action;
import java.util.Scanner;
import svc.MemberRegistService;
import util.ConsoleUtil;
import vo.Member;

//ȸ�� ���� ��û�� ó���ϴ� Action Ŭ����.
public class MemberRegistAction implements Action{
	
	@Override
	public void execute (Scanner scan) throws Exception{
		ConsoleUtil consoleUtil = new ConsoleUtil();
		Member newMember = consoleUtil.getNewMember(scan);
		
		//����Ͻ� ������Service Ŭ�������� ó����
		MemberRegistService memberRegistService = new MemberRegistService();
		
		boolean registSuccess = memberRegistService.registMember(newMember);
		if(registSuccess) {
			consoleUtil.printRegistSuccessMessage(newMember.getId());
		}else {
			consoleUtil.printRegistFailMessage(newMember.getId());
		//printregistFailMessage
		}
	}
	
}
