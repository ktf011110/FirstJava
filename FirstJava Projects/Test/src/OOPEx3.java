
//자바의 3대 생략 요소
//(1) extends Object

class A {
	public A() {
		System.out.println("A 클래스 생성");
	}
}
class B extends A {
	public B() {
		super();//모든 생성자의 첫 번째 라인에 들어가는 super(); - 생략 가능(어차피 무조건 들어감)
		System.out.println("B 클래스 생성");
	}
}

// (1) A a = new A();
// (2) B b = new B();
// (3) A c = new B();
// (4) B b = new A(); 되는 것, 안 되는 것을 알아야 함(저게 뭔지 이해하고 있어야 함)
//안 되는 것은 4번 뿐입니다.
//B가 A 클래스를 상속받았다. - B클래스가 더 기능이 많아 크다고 착각해 4번이 될 것이라고 착각하는 경우가 많음.




public class OOPEx3 {

	public static void main(String[] args) {
		
		A a = new B(); //왜 이렇게 하는지?
		

	}

}
