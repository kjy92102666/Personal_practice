package com.simple.ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cal_Sub {
//윈도우 초기설정, 배치,컴포넌트생성,버튼생성,컴포넌트 등록,윈도우 활성화
	
	private JLabel lblName;
	private JLabel lblName1;
	private JLabel lblResultName;

	public Cal_Sub() {
		JFrame jf = new JFrame();
		//초기 설정
		jf.setTitle("가상 윈도우창 계산기<->");
		jf.setSize(400,500);
		
		//배치
		jf.setLayout(null);
		
		//컴포넌트 생성
		lblName = new JLabel("숫자 1: ");
		lblName.setBounds(50,5,100,40);
		lblName1 = new JLabel("숫자 2: ");
		lblName1.setBounds(50,100,100,40);
		lblResultName = new JLabel("결과 ");
		lblResultName.setBounds(50,150,100,40);
		
		//키보드 입력 컴포넌트 JTextFiled
		JTextField tfName = new JTextField();
		tfName.setBounds(100,5,100,40);
		JTextField tfName1 = new JTextField();
		tfName1.setBounds(100,100,100,40);
		
		//결과값을 받을 텍스트필드상자
		
		JTextField tfOutName = new JTextField();
		tfOutName.setBounds(100,150,100,40);
		
		//버튼 생성
		JButton jbtn = new JButton("-");
		jbtn.setBounds(100,50,100,40);
		jbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = tfName.getText();
				String name1 = tfName1.getText();
				int n = Integer.parseInt(name);
				int n1 = Integer.parseInt(name1);
				int result = n-n1;
				if(n>n1) {
					result = n-n1;
				}else if(n<n1){
					result = n1-n;
				}
				
				tfOutName.setText(result+"");
				
			}
		});
		
		//컴포넌트 등록
		jf.add(jbtn);
		jf.add(lblName);
		jf.add(lblName1);
		jf.add(tfName);
		jf.add(tfName1);
		jf.add(tfOutName);
		jf.add(lblResultName);
		
		//윈도우 활성화
		jf.setVisible(true);
		jf.setResizable(false);
	}
	
	public static void main(String[] args) {
		new Cal_Sub();

		String 변수 = "변수";
		System.out.println(변수);
		String 韓 = "韓";
		System.out.println(韓);
	}
}
