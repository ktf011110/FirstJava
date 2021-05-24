
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUIEx {

	public static void main(String[] args) {
		
		//계산기 화면 만들기
		//판때기 역할을 하는 Frame이 필요
		JFrame f = new JFrame(); //판때기 생성
		
		f.setLayout(null); //레이아웃 설정
		//화면 배치관리자
//		FlowLayout layout = new FlowLayout();
//		f.setLayout(layout); //FlowLayout을 배치관리자로 설정
		
		JTextField t = new JTextField(10);
		t.setSize(300, 50);
		t.setLocation(0, 0);
		f.add(t);
		
		JButton b0 = new JButton("0"); //버튼 생성
		b0.setSize(50, 50);
		b0.setLocation(55, 330);
		f.add(b0); //판때기에 버튼 추가
		
		JButton b1 = new JButton("1");
		b1.setSize(50, 50);
		b1.setLocation(0, 275);
		f.add(b1);
		
		JButton b2 = new JButton("2");
		b2.setSize(50, 50);
		b2.setLocation(55, 275);
		f.add(b2);
		
		JButton b3 = new JButton("3");
		b3.setSize(50, 50);
		b3.setLocation(110, 275);
		f.add(b3);
		
		JButton b4 = new JButton("4");
		b4.setSize(50, 50);
		b4.setLocation(0, 220);
		f.add(b4);
		
		JButton b5 = new JButton("5");
		b5.setSize(50, 50);
		b5.setLocation(55, 220);
		f.add(b5);
		
		JButton b6 = new JButton("6");
		b6.setSize(50, 50);
		b6.setLocation(110, 220);
		f.add(b6);
		
		JButton b7 = new JButton("7");
		b7.setSize(50, 50);
		b7.setLocation(0, 165);
		f.add(b7);
		
		JButton b8 = new JButton("8");
		b8.setSize(50, 50);
		b8.setLocation(55, 165);
		f.add(b8);
		
		JButton b9 = new JButton("9");
		b9.setSize(50, 50);
		b9.setLocation(110, 165);
		f.add(b9);
		
		JButton b10 = new JButton("+");
		b10.setSize(50, 50);
		b10.setLocation(165, 165);
		f.add(b10);

		JButton b11 = new JButton("-");
		b11.setSize(50, 50);
		b11.setLocation(165, 220);
		f.add(b11);
		
		JButton b12 = new JButton("*");
		b12.setSize(50, 50);
		b12.setLocation(165, 275);
		f.add(b12);
		
		JButton b13 = new JButton("/");
		b13.setSize(50, 50);
		b13.setLocation(165, 330);
		f.add(b13);
		
		JButton b14 = new JButton("=");
		b14.setSize(50, 50);
		b14.setLocation(110, 330);
		f.add(b14);
		
		JButton b15 = new JButton("C");
		b15.setSize(50, 50);
		b15.setLocation(0, 330);
		f.add(b15);
		
		
		
		f.setSize(250, 450); //판때기 크기
		f.setLocation(200, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //강제 종료 기능 활성화
		f.setVisible(true); //화면에 보여주기

	}

}
