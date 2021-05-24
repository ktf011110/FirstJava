
//추상화 메소드 : 기능이 구현되어 있지 않은(없는) 메소드
//              : 문법적으로 추상화 메소드는 "{ }"가 존재하지 않으며
//              : 문장의 끝부분에 ";"을 기입해 주어야 함
//              : 메소드 선언 앞부분에 "abstract"라고 정의해 주어야 함

//추상화 클래스 : 추상화 메소드를 하나 이상 가지는 클래스
//              : 문법적으로 추상화 클래스는 맨 앞부분에 
//              : "abstract"라고 정의해 주어야 함
//              : new를 통해 객체화 불가능

abstract class MyA {
	abstract public void add();
}

abstract class Animal {
	abstract public void cry();
}

class Dog extends Animal{
	//상위 클래스 추상화 메소드 cry 기능을 완성 - 객체화가 가능해짐
	//기능을 만들지 않으면 메소드를 사용할 수 없음
	//무조건 특정 메소드를 하위 클래스에서 만들 수밖에 없도록 함
	//예) 프로젝트 매니저가 특정 기능 구현을 강제하는 데에 필요함
	
	public void cry() {
		System.out.println("강아지 울음소리");
	}
}

class Cat extends Animal{
	public void cry() {
		System.out.println("고양이 울음소리");
	}
}

public class AbstractEx {

	public static void main(String[] args) {
		
		
	}

}
