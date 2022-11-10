package com.simple.ex;

import java.awt.Color;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//import ui.MemberUI;
//import vo.Member;
//import vo.SearchData;

public class ConsoleUtil{
	//MemberUI mui = new MemberUI();
	ConsoleUtil(){

        JFrame f= new JFrame("Panel Example");    
        JPanel panel=new JPanel();  
        panel.setBounds(40,80,200,200);    
        panel.setBackground(Color.gray);  

        f.add(panel);  
        f.setSize(600,700);    
        f.setLayout(null);    
        f.setVisible(true);    
		
	}
	
	public Member getNewMember (int lbmenu_num) {
		Member newMember = new Member();
		System.out.println("======== 새 회원 정보 등록 ========");
		System.out.println("회원아이디(int): ");
		int id = newMember.getId();
		System.out.println("회원이름(str) : ");
		//String name = scan.next();
		System.out.println("회원이메일(str) : ");
		//String email = scan.next();
		System.out.println("회원주소(str) : ");
		//String addr = scan.next();
		System.out.println("회원취미(str) : ");
		//String hobby = scan.next();
		System.out.println("회원전화번호(str) : ");
		//String tel = scan.next();
		System.out.println("회원나이(int) : ");
		//int age = scan.nextInt();
		
		newMember.setId(id);
		//newMember.setId(id);
		newMember.setName(name);
		newMember.setEmail(email);
		newMember.setAddr(addr);
		newMember.setHobby(hobby);
		newMember.setTel(tel);
		newMember.setAge(age);
		return newMember;
	}
	
//	public void printRegistSuccessMessage(int id) {
//		System.out.println(id + "님, 회원 등록 성공");
//		//tfBody.setText(id + "님, 회원 등록 성공");
//	}
//	
//	public void printRegistFailMessage(int id) {
//		System.out.println(id + "님, 회원 등록 실패");
//	}
//	
//	public void printMemberList(Member[] memberArray) {
//		if(memberArray.length == 0) {
//			System.out.println("추가된 회원 정보가 없습니다.");
//		}else {
//			for(int i=0; i<memberArray.length; i++) {
//				System.out.println(memberArray[i]);
//			}
//		}
//	}
//	
//	public int getId(String msgKind, Scanner scan) {
//		System.out.println(msgKind + "아이디 : ");
//		return scan.nextInt();	//사용자가 입력한 아이디를 바로 return해준다.
//	}
//	
	public Member getNewMember (Member oldMember, Scanner scan) {
		
		System.out.println("========= 새 회원 정보 수정 =========");
		System.out.println("회원 아이디 : " + oldMember.getId());
		System.out.println("이전 이름 : " + oldMember.getName());
		System.out.println("새 회원 이름 : ");
		String name = scan.next();
		System.out.println("이전 이메일: " + oldMember.getEmail());
		System.out.println("새 회원 이메일 : ");
		String email = scan.next();
		System.out.println("이전 주소: " + oldMember.getAddr());
		System.out.println("새 회원 주소: ");
		String addr = scan.next();
		System.out.println("이전 취미: " + oldMember.getHobby());
		System.out.println("새 회원 취미 : ");
		String hobby = scan.next();
		System.out.println("이전 전화번호 : " + oldMember.getTel());
		System.out.println("새 회원 전화번호");
		String tel = scan.next();
		System.out.println("이전 나이 : " + oldMember.getAge());
		System.out.println("새 회원 나이");
		int age = scan.nextInt();
//		
//		member.setId(oldMember.getId());
//		member.setName(name);
//		member.setEmail(email);
//		member.setAddr(addr);
//		member.setHobby(hobby);
//		member.setTel(tel);
//		member.setAge(age);
//		return member;
//	}
//	
//	public void printUpdateSuccessMessage(int id) {
//		System.out.println(id + "번, 회원 정보 수정");
//	}
//	
//	public void printUpdateFailMessage(int id) {
//		System.out.println(id + "번, 회원 정보 수정 실패");
//	}
//	
//	public void printDeleteSuccessMessage(int id) {
//		System.out.println(id + "번, 회원 정보 삭제 성공");
//	}
//	
//	public void printDeleteFailMessage(int id) {
//		System.out.println(id + "번, 회원 정보 삭제 실패");
//	}
//	
//	public SearchData getSearchData(Scanner scan) {
//		System.out.println("검색 조건을 선택하시오.");
//		 System.out.println("1. id");
//		 System.out.println("2. name");
//		 System.out.println("검색 조건 : ");
//		 String searchCondition = scan.next();//검색 조건 선택
//		 String searchValue = null;			  //검색 값
//		 
//		 if(searchCondition.equals("id")) {
//			 System.out.println("검색할 아이디: ");
//			 searchValue = scan.next();
//			 //System.out.println("검색 한 아이디 : " + searchValue);
//		 }else if(searchCondition.equals("name")) {
//			 System.out.println("검색할 이름 : ");
//			 searchValue = scan.next();
//		 }
//		
//		 SearchData searchData = new SearchData();	
//		 //리턴할 값이 두개 이므로 리턴할 값을 속성으로 저장할 클래스 설계
//		 searchData.setSearchCondition(searchCondition);
//		 searchData.setSearchValue(searchValue);
//		 return searchData;
//		 
//		 //if(searchData)
//	}
//	
//	public void printSearchMember(Member member) {
//		if(member == null) {
//			System.out.println("검색한 결과가 없습니다.");
//		}else {
//			System.out.println(member.getId() + "으로 검색한 결과 ");
//			System.out.println(member);
//		}
//	}
//	
//	public void printSearchMemberArray(Member[] memberArray) {
//		if(memberArray == null) {
//			System.out.println("이름으로 검색한 결과가 없습니다.");
//		}else {
//			System.out.println("이름으로 검색한 결과 : ");
//			
//			for(int i=0; i<memberArray.length; i++) {
//				System.out.println(memberArray[i]);
//			}
//		}
//	}
	
	
}
