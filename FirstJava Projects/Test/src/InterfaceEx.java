
//interface : �߻�ȭ �޼ҵ� + ����θ� ����
//          : ��üȭ �Ұ���
//          : interface Ŭ������ �ƴϹǷ� "extends"�� ���� ��� �Ұ���
//          : ��ſ� "implements" ������ ���

interface MyInter {
	final int age = 20; 
	//final�� ���� ���� �����ϸ� ����� ��(�ٲ� �� ����)
	abstract public void add(); 
	//abstract ���� ���������� ���°� �������� ����
}

class MyInterEx implements MyInter{
	//�������̽��� ������� �� �߻�ȭ �޼ҵ带 ������ ���̹Ƿ� �޼ҵ� ������ �ʿ���
	public void add() {
		
	}
}

public class InterfaceEx {

	public static void main(String[] args) {
		
		
	}

}
