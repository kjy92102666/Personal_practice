package action;

import java.util.Scanner;
import svc.MemberSearchService;
import util.ConsoleUtil;
import vo.Member;
import vo.SearchData;

//회원정보 검색 요청을 처리하는 Action클래스.
public class MemberSearchAction implements Action{
	
	@Override
	public void execute(Scanner scan) {
		ConsoleUtil consoleUtil = new ConsoleUtil();

		SearchData searchData = consoleUtil.getSearchData(scan);
		MemberSearchService memberSearchService = new MemberSearchService();
		
		if(searchData.getSearchCondition().equals("아이디")) {
			Member member = memberSearchService.searchMemberById(searchData.getSearchValue());
			consoleUtil.printSearchMember(member);
		}
		else if(searchData.getSearchCondition().equals("이름")) {
			Member[] memberArray = memberSearchService.searchMemberByName(searchData.getSearchValue());
			consoleUtil.printSearchMemberArray(memberArray);
		}
		
	}
	
}
