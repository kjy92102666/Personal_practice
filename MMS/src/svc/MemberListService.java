package svc;

import ui.MemberUI;
import vo.Member;
//현재까지 가입되어 있는 회원정보 저장.
public class MemberListService {
	
	public Member[] getMemberArray() {
		return MemberUI.memberArray;
	}
}
