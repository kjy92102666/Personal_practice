package action;

import java.util.Scanner;
import svc.MemberSearchService;
import util.ConsoleUtil;
import vo.Member;
import vo.SearchData;

//ȸ������ �˻� ��û�� ó���ϴ� ActionŬ����.
public class MemberSearchAction implements Action{
	
	@Override
	public void execute(Scanner scan) {
		ConsoleUtil consoleUtil = new ConsoleUtil();

		SearchData searchData = consoleUtil.getSearchData(scan);
		MemberSearchService memberSearchService = new MemberSearchService();
		
		if(searchData.getSearchCondition().equals("���̵�")) {
			Member member = memberSearchService.searchMemberById(searchData.getSearchValue());
			consoleUtil.printSearchMember(member);
		}
		else if(searchData.getSearchCondition().equals("�̸�")) {
			Member[] memberArray = memberSearchService.searchMemberByName(searchData.getSearchValue());
			consoleUtil.printSearchMemberArray(memberArray);
		}
		
	}
	
}
