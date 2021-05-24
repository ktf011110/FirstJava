//EventHandling
//어떤 이벤트를 처리할 것인가?
//해당 이벤트를 처리할 수 있는 인터페이스는 누구인가?
//이벤트 처리 기능이 있는 인터페이스 구현
//ex) class MyListener implements ActionListener
// - 이벤트 처리를 위해 정의된 클래스 객체화 (new MyListener() )
//감시 대상에 달아주기 ( xxx.addActionListener( m ) )


public class Main {

	public static void main(String[] args) {
		CalGUI c = new CalGUI();
		c.setVisible(true);
	}
	

}
