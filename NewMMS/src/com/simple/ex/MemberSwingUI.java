package com.simple.ex;

import java.awt.Color;
import java.awt.Component;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//
public class MemberSwingUI extends JFrame implements ActionListener{
	public static Member[] memberArray = new Member[0];
	
	List<String> info = new ArrayList<>(7);
	
	int count = 0;
	
	private JLabel lblTitle;
	private JTextField tfBody;	//입력받을 바디.
	private TextArea tfUpBody;
	private JButton lbbtn1;	//회원가입
	private JButton lbbtn2;	//목록보기
	private JButton lbbtn3; //정보수정
	private JButton lbbtn4; //정보삭제
	private JButton lbbtn5; //정보검색
	private JButton lbbtn6; //종료
	
	private int lbmenu_num;	//각 메뉴의 숫자값을 담을 변수

	
	private JLabel lblInsert;
	private JTextField tfInsert;
	private JButton insertbtn;
	
	private String lbmenu;
	private String insert_V;
	
	private String[] arr; //후... split 후 값들 배열
	
	//회원정보 담을 변수들
	private int id;		//회원 아이디(int)
	private String name;//회원 이름(str)
	private int age;	//회원 나이(int)
	private String mail;//회원 이메일(str)
	private String add;	//회원 주소(str)
	
	private int c_insert_V; //삭제기능 값 비교할 int형 회원번호
	
	Scanner sc = new Scanner(System.in);
	Member member = new Member();
	
	public MemberSwingUI() {
		
		this.setSize(700,1000);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lblTitle = new JLabel("====================================회원 데이터 관리====================================");
		lblTitle.setBounds(20,30,650,50);	//간격
		
		lbbtn1 = new JButton("회원가입");
		lbbtn1.setBounds(20,80,100,40);
		lbbtn1.addActionListener(this);
		
		lbbtn2 = new JButton("목록보기");
		lbbtn2.setBounds(125,80,100,40);
		lbbtn2.addActionListener(this);
		
		lbbtn3 = new JButton("정보수정");
		lbbtn3.setBounds(230,80,100,40);
		lbbtn3.addActionListener(this);
		
		lbbtn4 = new JButton("정보삭제");
		lbbtn4.setBounds(335,80,100,40);
		lbbtn4.addActionListener(this);
		
		lbbtn5 = new JButton("정보검색");
		lbbtn5.setBounds(440,80,100,40);
		lbbtn5.addActionListener(this);
		
		lbbtn6 = new JButton("종료");
		lbbtn6.setBounds(545,80,100,40);
		lbbtn6.addActionListener(this);
		
		lblInsert = new JLabel("입력값");
		lblInsert.setBounds(20,140,60,40);
		tfInsert = new JTextField();	//입력값 받을 TextField
		tfInsert.setBounds(80,140,260,40);
		insertbtn = new JButton("확인");
		insertbtn.setBounds(340,140,60,40);
		insertbtn.addActionListener(new ActionListener() {

			

			//"아이디(int) | 이름(str) | 나이(int) | 이메일(str) | 주소(str)"
			//입력받은 값이 tfUpBody에 들어가도록 
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("count : "+ count);1 나옴
				if(lbmenu_num==1) {
					insert_V = tfInsert.getText();

					arr = insert_V.split(" ");
					
					tfBody.setText("아이디:"+arr[0]+", "+"이름:"+arr[1]+", "+
					"나이:"+arr[2]+", "+"이메일:"+arr[3]+", "+"주소:"+arr[4]);
					
					//arr의 값 : [Ljava.lang.String;@458115e0
					id = Integer.parseInt(arr[0]);
					member.setId(id);
					member.setName(arr[1]);
					age = Integer.parseInt(arr[2]);
					member.setAge(age);
					member.setEmail(arr[3]);
					member.setAddr(arr[4]);
					
					System.out.println("member의 값 : "+member.toString());
					
					//arr.length가 5기 때문에, 5번씩 출력! 상향포문변경해보기~
					
					for(int i=0; i<=info.size(); i++) {
						info.add(member.toString());
					}
					
					System.out.println("info.toString() : "+info.toString());
					
					
					
					
				}else if(lbmenu_num==4) { //정보삭제 클릭시,
					insert_V = tfInsert.getText();
					c_insert_V = Integer.parseInt(insert_V);
					if( (lbmenu_num==4) && (c_insert_V == id)) {
						//
						try {
							for(int i=0; i<arr.length; i++) {
								//memberArray = arr[i];
								arr[i]=null;
							
							}
							arr = null;
							tfBody.setText(id+"번 회원님의 정보가 삭제 되었습니다.");
						}catch(ArrayIndexOutOfBoundsException ee) {
							ee.printStackTrace();
						}
					}else if((c_insert_V != id)) {
						tfBody.setText("삭제 할 id가 올바르지 않습니다.  "+insert_V +"    "+arr[0]);
					}
				}

			}
		});
		
		tfUpBody = new TextArea();
		tfUpBody.setBounds(20,200,650,350);
		
		//정보들 출력 될 영역
		tfBody = new JTextField();
		tfBody.setBounds(20,550,650,350);
		//tfBody. 안에 메인함수를 불러와야되나..? 
		
		//순서대로 배치하기.
		this.add(lblTitle);
		this.add(lbbtn1);
		this.add(lbbtn2);
		this.add(lbbtn3);
		this.add(lbbtn4);
		this.add(lbbtn5);
		this.add(lbbtn6);
		
		this.add(lblInsert);
		this.add(tfInsert);
		
		this.add(insertbtn);
		this.add(tfUpBody);
		this.add(tfBody);

		this.setVisible(true);
		this.setResizable(false);
		
	}//MemberUI() eom

	@Override
	public void actionPerformed(ActionEvent e) {
		//TextArea
		if(e.getSource()==lbbtn1) {
		lbmenu = lbbtn1.getText();
		
			if (lbmenu=="회원가입") {
				System.out.println(lbmenu+"을(를) 선택하셨습니다.");
				lbmenu_num = 1;
				tfUpBody.setText("<< 새 회원 정보 등록 >>\n"+
						"회원아이디(int) | 회원이름(str) | 회원나이(int) "
						+ "| 회원이메일(str) "	+ "| 회원주소(str)를 입력하세요.\n"
						+"( | 기호 마다, 띄워쓰기를 해주세요!)");
	
				//count = lbmenu_num;	//버튼이 눌려짐 표시. 이거필요함?
				
				System.out.println("count값은 : "+count);
				//tfBody.setText(newMember+"");
			}
			
		}else if(e.getSource()==lbbtn2) {
			lbmenu = lbbtn2.getText();
			if ((lbmenu == "목록보기")&&(arr!=null)) {
				tfUpBody.setText("<< 회원 목록 보기 >>");
				tfBody.setText(info.toString());
			}else {
				tfBody.setText("데이터가 없습니다...");
				
			}
		}else if(e.getSource()==lbbtn3) {
			lbmenu = lbbtn3.getText();
			if (lbmenu == "정보수정") {
				tfUpBody.setText("<< 회원 정보 수정 >>");
				tfBody.setText(" ");
			}
		}else if(e.getSource()==lbbtn4) {
			lbmenu = lbbtn4.getText();
			lbmenu_num = 4;
			if (lbmenu == "정보삭제") {
				tfUpBody.setText("<< 회원 정보 삭제 >>\n" 
			+ "삭제 할 회원 아이디를 입력 해 주세요");

				//tfBody.setText("회원 정보 삭제 완료.");
				tfBody.setText(member.toString());
			}
		}else if(e.getSource()==lbbtn5) {
			lbmenu = lbbtn5.getText();
			if (lbmenu == "정보검색") {
				tfUpBody.setText("<< 회원 정보 검색 >>");
				tfBody.setText(" ");
				
			}
		}else if(e.getSource()==lbbtn6) {
			lbmenu = lbbtn6.getText();
			if (lbmenu == "종료") {
				tfBody.setText(" ");
				//System.out.println(lbmenu+"을(를) 선택하셨습니다.");
				System.exit(0);	
				System.out.println("프로그램 종료.");	
			}
		}
			
	}
	
	public static void main(String[] args) {
		new MemberSwingUI();
	}
}
