import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

//ActionListener : 버튼 클릭을 감시하는 기능을 정의해 둔 interface

//버튼 클릭을 감시할 감시자 정의
class MyListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		//콜백 메소드 (callback method)
		// : 프로그래머가 호출하지 않고 시스템이 호출해 주는 메소드
		//현재 메소드는 버튼이 클릭되었을 경우 호출되는 메소드
		//"언제" 호출되는지 파악하고 있어야 함
		//버튼이 클릭되었을 경우 처리할 작업을 코딩
		MyGUI.jt.setText("123");
		//static이더라도 MyGUI 클래스의 jt라는 것을 알려줘야 어떤 클래스의 것인지 알 수 있음
		
	}
	
}

class MyGUI {
	JFrame jf = new JFrame();
	JButton b = new JButton("ABC");
	static JTextField jt = new JTextField(10);//static 선언을 하면 프로그램 시작 - 끝까지 계속 메모리에 존재 (어디에서도 쓸 수 있음)
	
	public MyGUI() {
		
		//생성자
		jt.setText("ABC");
		FlowLayout layout = new FlowLayout();
		jf.setLayout(layout);
		
		MyListener m = new MyListener(); //버튼 클릭을 감시하기 위한 감시자 객체화
		b.addActionListener(m); //버튼에 감시자 달아주기
		
		jf.add(jt);
		jf.add(b);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//종료 기능 활성화
		jf.setVisible(true); //판때기를 화면에 노출
		jf.setSize(200, 200);
		jf.setLocation(300, 300);
	}
	
}


public class EventHandlingEx {

	public static void main(String[] args) {
		new MyGUI(); //실제 프로그램에서는 main에 다 구현하지 않고 이 파일과 같이 클래스로 빼냄
		
	}

}
