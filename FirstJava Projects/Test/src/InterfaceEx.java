
//interface : 추상화 메소드 + 상수로만 구성
//          : 객체화 불가능
//          : interface 클래스가 아니므로 "extends"를 통해 상속 불가능
//          : 대신에 "implements" 문법을 사용

interface MyInter {
	final int age = 20; 
	//final을 통해 값을 정의하면 상수가 됨(바꿀 수 없다)
	abstract public void add(); 
	//abstract 생략 가능하지만 적는게 가독성에 좋음
}

class MyInterEx implements MyInter{
	//인터페이스도 상속했을 때 추상화 메소드를 가져온 것이므로 메소드 구현이 필요함
	public void add() {
		
	}
}

public class InterfaceEx {

	public static void main(String[] args) {
		
		
	}

}
