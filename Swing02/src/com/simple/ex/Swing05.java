package com.simple.ex;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//Frame�� ��� �޾Ҵ�. 02���� �� ������ �� ���� ���δ�.
public class Swing05 extends JFrame {
	JButton btn; //��ư�� Ŭ���� ����� ����. ������ Ŭ������ �����.
	JTextField tfName;
	JLabel lblName;
	private JTextField tfNameOut;
	private JLabel lblName1;
	private JTextField tfName1;
	
	public Swing05() {
		//������ �ʱ� ����
		setTitle("������01");
		setSize(400,500);	//���� ���� ũ��
		
		//������ ��ġ ����
		setLayout(null); 
		
		//������Ʈ ��ġ�� ���� ����.(��ġ, ũ��)
		
		//���ϴ� ������Ʈ ����
		//Ű���� �Է� ������Ʈ JTextFiled(�ֿܼ��� Scanner)
		lblName = new JLabel("����1 : "); //��� ���ĵǼ� �����ٰŴ�~
		lblName.setBounds(50, 5, 100, 40);
		lblName1 = new JLabel("����2 : ");
		lblName1.setBounds(50, 50, 100, 40);
		
		tfName = new JTextField();//���� ���� �ؽ�Ʈ����.
		tfName.setBounds(100,5,100,40);
		tfName1 = new JTextField();
		tfName1.setBounds(100,55,100,40);
		
		tfNameOut = new JTextField();
		tfNameOut.setBounds(100,150,100,40);
		
		//��ư ����
		btn = new JButton("+");
		btn.setBounds(100,100,100,40);//x,y,����,����	
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String name = tfName.getText();
				int n = Integer.parseInt(name);
				
				String name1 = tfName1.getText();
				int n1 = Integer.parseInt(name1);
				int result = n + n1;
				
				tfNameOut.setText(result+"");
				
			}
		});
		
		//�����ӿ� ������Ʈ ���. 
		add(btn);

		add(tfName);
		add(tfName1);
		add(tfNameOut);
		add(lblName);
		add(lblName1);
		
		//������ Ȱ��ȭ(������ ���̰�)
		setVisible(true); //false�� �ٲٸ� �����ص� ȭ���� �Ⱥ��δ�.
		setResizable(false); //âũ�� ����. ũ��ٲܰų�? false.
				
	}
	public static void main(String[] args) {
		Swing05 f1 = new Swing05();

	}
}
