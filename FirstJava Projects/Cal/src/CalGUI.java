
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//���� ȭ�� ����



public class CalGUI extends JFrame {
	JTextField jt;
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
	JButton equal, plus, mul, minus, div, ac;
	
	class MyListener implements ActionListener {
		//���� Ŭ���� ���
		//�߻�ȭ �޼ҵ带 ������ �߻�ȭ Ŭ������ �Ǿ����. - �������� ���� �޼ҵ带 �������Ͽ��� ��
		@Override
		public void actionPerformed(ActionEvent e) { //callback method
			//��ư�� Ŭ���Ǿ��� �� ������ ��� ����
			String str = e.getActionCommand(); //Ŭ���� ��ư�� �̸� ��������
			switch (str) {
			case "0":
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				
			case "+":
			case "-":
			case "*":
			case "/":
				jt.setText( jt.getText() + str ); //��ư �̸� �״�� ȭ�鿡 �����
				break;
			case "=":
				//��� ���ϴ� �ڵ尡 ���⿡ ���ϴ�.
			}
			jt.setText( jt.getText() + str ); //��ư �̸� �״�� ȭ�鿡 �����
			
			
			
		}
		
		
	}
	
	public CalGUI() {
		
		
		
		JButton[] BTN = new JButton[10];
		
		
		jt = new JTextField(15);
		/*
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		*/
		
		MyListener m = new MyListener(); // ��ư Ŭ�� ���ø� ���� ������ ��üȭ
		/*
		b0.addActionListener(m); //b0�� ������ �޾��ֱ�
		b1.addActionListener(m);
		b2.addActionListener(m);
		b3.addActionListener(m);
		b4.addActionListener(m);
		b5.addActionListener(m);
		b6.addActionListener(m);
		b7.addActionListener(m);
		b8.addActionListener(m);
		b9.addActionListener(m);
		*/
		
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		
		add(jt);
		/*
		add(b0);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		*/
		for(int i=0; i<BTN.length; i++)
		{
			BTN[i].setFont(new Font("���� ���", 0, 10));
			BTN[i].setBackground(Color.GRAY);
			BTN[i].setForeground(Color.WHITE);
			BTN[i] = new JButton(i+"");
			BTN[i].addActionListener(m);
			add(BTN[i]);
		}
		
		equal = new JButton("="); 
		equal.addActionListener(m);//������ �޾��ֱ�
		add(equal);
		
		plus = new JButton("+");
		plus.addActionListener(m);
		add(plus);
		
		minus = new JButton("-");
		minus.addActionListener(m);
		add(minus);
		
		mul = new JButton("*");
		mul.addActionListener(m);
		add(mul);
		
		div = new JButton("/");
		div.addActionListener(m);
		add(div);
		
		ac = new JButton("AC");
		ac.addActionListener(m);
		add(ac);

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200, 200);
		setSize(300, 300);
	}
}
