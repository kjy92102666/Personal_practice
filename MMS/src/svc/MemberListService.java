package svc;

import ui.MemberUI;
import vo.Member;
//������� ���ԵǾ� �ִ� ȸ������ ����.
public class MemberListService {
	
	public Member[] getMemberArray() {
		return MemberUI.memberArray;
	}
}
