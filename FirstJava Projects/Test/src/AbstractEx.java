
//�߻�ȭ �޼ҵ� : ����� �����Ǿ� ���� ����(����) �޼ҵ�
//              : ���������� �߻�ȭ �޼ҵ�� "{ }"�� �������� ������
//              : ������ ���κп� ";"�� ������ �־�� ��
//              : �޼ҵ� ���� �պκп� "abstract"��� ������ �־�� ��

//�߻�ȭ Ŭ���� : �߻�ȭ �޼ҵ带 �ϳ� �̻� ������ Ŭ����
//              : ���������� �߻�ȭ Ŭ������ �� �պκп� 
//              : "abstract"��� ������ �־�� ��
//              : new�� ���� ��üȭ �Ұ���

abstract class MyA {
	abstract public void add();
}

abstract class Animal {
	abstract public void cry();
}

class Dog extends Animal{
	//���� Ŭ���� �߻�ȭ �޼ҵ� cry ����� �ϼ� - ��üȭ�� ��������
	//����� ������ ������ �޼ҵ带 ����� �� ����
	//������ Ư�� �޼ҵ带 ���� Ŭ�������� ���� ���ۿ� ������ ��
	//��) ������Ʈ �Ŵ����� Ư�� ��� ������ �����ϴ� ���� �ʿ���
	
	public void cry() {
		System.out.println("������ �����Ҹ�");
	}
}

class Cat extends Animal{
	public void cry() {
		System.out.println("����� �����Ҹ�");
	}
}

public class AbstractEx {

	public static void main(String[] args) {
		
		
	}

}
