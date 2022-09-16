package ui;

import java.util.*;

import action.Action;
import action.MemberDeleteAction;
import action.MemberListAction;
import action.MemberUpdateAction;
import action.MemberRegistAction;  
import action.MemberSearchAction;
import controller.MemberController;
import vo.Member;

//���� �Լ� memberUI.
public class MemberUI {
	public static Member[] memberArray = new Member[0];
	
	public static void main(String[] args) {
		MemberController memberController = new MemberController();
		boolean stop = false;
		Scanner sc = new Scanner(System.in);
		Action action = null;
		int menu = 0;
		
		do {
			System.out.println("=====ȸ�� ������ ����=====");
			System.out.println("1. ȸ�� ����");		//Create
			System.out.println("2. ȸ�� ��� ����");	//Read
			System.out.println("3. ȸ�� ���� ����");	//Update
			System.out.println("4. ȸ�� ���� ����");	//Delete
			System.out.println("5. ȸ�� ���� �˻�");	//Read
				System.out.println("6.���α׷� ����");
				
			System.out.println("�޴� ��ȣ : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				action = new MemberRegistAction();	//ȸ�� ����
				break;
			case 2:
				action = new MemberListAction();	//ȸ�� ���
				break;
			case 3:
				action = new MemberUpdateAction();	//ȸ�� ����
				break;
			case 4:
				action = new MemberDeleteAction();	//ȸ�� ����
				break;
			case 5:
				action = new MemberSearchAction();	//ȸ�� �˻�
				break;
			case 6:
				stop = true;
				System.out.println("���α׷� ����.");
				break;
				default:
					break;
			}
			
			if(action != null) {
				memberController.processRequest(sc, action);//�̰� �� 
			}
			
		}while(!stop);
	}
}
