package svc;

import ui.MemberUI;
import vo.Member;
//삭제 해결 알고리즘
public class MemberDeleteService {
	
	public boolean deleteMember (int id) {
		
		boolean deleteSuccess = false;
		int index = -1;
		
		for(int i=0; i<MemberUI.memberArray.length; i++) {
			if(MemberUI.memberArray[i].getId()==id) {
				index = i;
			}
		}
		
		if(index != -1) {//삭제될 게임 객체를 찾았다.?
			Member[] tempArray = MemberUI.memberArray;
			MemberUI.memberArray = new Member[MemberUI.memberArray.length-1];
			
			for(int i=0; i<tempArray.length; i++) {
				if(i<index) {
					MemberUI.memberArray[i] = tempArray[i];
				}else if(i > index) {
					MemberUI.memberArray[i-1] = tempArray[i];
				}
			}
			deleteSuccess = true;
		}
		return deleteSuccess;
		
	}
	
}
