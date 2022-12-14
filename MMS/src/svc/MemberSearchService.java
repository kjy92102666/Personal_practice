package svc;

import ui.MemberUI;
import vo.Member;

//회원 정보 검색 클래스.
public class MemberSearchService {
	
	public Member searchMemberById(String searchValue) {
		Member member = null;
		
		for(int i=0; i<MemberUI.memberArray.length; i++) {
			if(MemberUI.memberArray[i].getId()==Integer.parseInt(searchValue)) {
				member = MemberUI.memberArray[i];
				break;
			}
		}
		return member;
	}
	
	public Member[] searchMemberByName(String searchValue) {
		Member[] searchMemberArray = null;
		int count = 0;
		Member[] tempArray = new Member[MemberUI.memberArray.length];
		
		for(int i=0; i<MemberUI.memberArray.length; i++) {
			if(searchValue.equals(MemberUI.memberArray[i].getName())) {
				tempArray[count++] = MemberUI.memberArray[i];
			}
		}
		
		searchMemberArray = new Member[count];
		
		for (int i=0; i<count; i++) {
			searchMemberArray[i] = tempArray[i];
		}
		
		return searchMemberArray;
	}
	
}