
//�ڹ��� 3�� ���� ���
//(1) extends Object

class A {
	public A() {
		System.out.println("A Ŭ���� ����");
	}
}
class B extends A {
	public B() {
		super();//��� �������� ù ��° ���ο� ���� super(); - ���� ����(������ ������ ��)
		System.out.println("B Ŭ���� ����");
	}
}

// (1) A a = new A();
// (2) B b = new B();
// (3) A c = new B();
// (4) B b = new A(); �Ǵ� ��, �� �Ǵ� ���� �˾ƾ� ��(���� ���� �����ϰ� �־�� ��)
//�� �Ǵ� ���� 4�� ���Դϴ�.
//B�� A Ŭ������ ��ӹ޾Ҵ�. - BŬ������ �� ����� ���� ũ�ٰ� ������ 4���� �� ���̶�� �����ϴ� ��찡 ����.




public class OOPEx3 {

	public static void main(String[] args) {
		
		A a = new B(); //�� �̷��� �ϴ���?
		

	}

}