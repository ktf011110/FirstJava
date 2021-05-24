import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

//ActionListener : ��ư Ŭ���� �����ϴ� ����� ������ �� interface

//��ư Ŭ���� ������ ������ ����
class MyListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		//�ݹ� �޼ҵ� (callback method)
		// : ���α׷��Ӱ� ȣ������ �ʰ� �ý����� ȣ���� �ִ� �޼ҵ�
		//���� �޼ҵ�� ��ư�� Ŭ���Ǿ��� ��� ȣ��Ǵ� �޼ҵ�
		//"����" ȣ��Ǵ��� �ľ��ϰ� �־�� ��
		//��ư�� Ŭ���Ǿ��� ��� ó���� �۾��� �ڵ�
		MyGUI.jt.setText("123");
		//static�̴��� MyGUI Ŭ������ jt��� ���� �˷���� � Ŭ������ ������ �� �� ����
		
	}
	
}

class MyGUI {
	JFrame jf = new JFrame();
	JButton b = new JButton("ABC");
	static JTextField jt = new JTextField(10);//static ������ �ϸ� ���α׷� ���� - ������ ��� �޸𸮿� ���� (��𿡼��� �� �� ����)
	
	public MyGUI() {
		
		//������
		jt.setText("ABC");
		FlowLayout layout = new FlowLayout();
		jf.setLayout(layout);
		
		MyListener m = new MyListener(); //��ư Ŭ���� �����ϱ� ���� ������ ��üȭ
		b.addActionListener(m); //��ư�� ������ �޾��ֱ�
		
		jf.add(jt);
		jf.add(b);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���� ��� Ȱ��ȭ
		jf.setVisible(true); //�Ƕ��⸦ ȭ�鿡 ����
		jf.setSize(200, 200);
		jf.setLocation(300, 300);
	}
	
}


public class EventHandlingEx {

	public static void main(String[] args) {
		new MyGUI(); //���� ���α׷������� main�� �� �������� �ʰ� �� ���ϰ� ���� Ŭ������ ����
		
	}

}
