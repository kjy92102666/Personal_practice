package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RRNStr extends JFrame{

	private JLabel lblRRN;
	private JLabel lblName;
	private JLabel lblResult;
	
	private JTextField lbltfRRN;
	private JTextField lbltfName;
	private JTextField lbltfResult;

	public RRNStr() {
		
		//������ �ʱ⼳��
		this.setTitle("�ֹε�Ϲ�ȣ ���ڿ� ó����");
		this.setSize(400, 500);
		
		//������ ��ġ����? �ǹ�Q
		this.setLayout(null);
		
		//������Ʈ ����
		//��ư ����
		lblRRN = new JLabel("�ֹι�ȣ");
		lblRRN.setBounds(40,100,80,40);
		lblName = new JLabel("�� ��");
		lblName.setBounds(40,150,80,40);
		lblResult = new JLabel("üũ���");
		lblResult.setBounds(40,200,80,40);
		
		lbltfRRN = new JTextField();
		lbltfRRN.setBounds(130,100,120,40);
		lbltfName = new JTextField();
		lbltfName.setBounds(130,150,120,40);
		lbltfResult = new JTextField();
		lbltfResult.setBounds(130,200,120,40);
		
		JButton jbtn = new JButton("Ȯ��");
		jbtn.setBounds(100,250,120,40);
		jbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String rrn = lbltfRRN.getText();
				String name = lbltfName.getText();
				
				
				//lbltfResult.setText();
				
				
			}
		});
		
		
		//�����ӿ� ������Ʈ ���
		this.add(lblRRN);
		this.add(lblName);
		this.add(lblResult);
		this.add(lbltfRRN);
		this.add(lbltfName);
		this.add(lbltfResult);
		this.add(jbtn);
		
		
		
		
		
		
		//������ Ȱ��ȭ
		this.setVisible(true);
		this.setResizable(false);
		
		
	}
	
	public static void main(String[] args) {
		new RRNStr();
	}
}
