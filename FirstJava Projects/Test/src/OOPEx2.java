
class Person {
	int age;
	private String name;
	
	public void setName(String n) {//�Լ�(�޼ҵ�)�� ��Ȱ���� ���� ���� ����
		name = n+"��";
	}
}

public class OOPEx2 {

	public static void main(String[] args) {
		
		Person p1 = new Person();//�⺻ �ڷ����� �ƴϹǷ� p1�� �ּҰ� ���Եȴ�.
		p1.age = 20;
		p1.setName("��浿"); //�̷� ������ �����? �Ʒ� �ּ� �ڵ�� ���������� ���ŷ�����, �� �ڵ�� �޼ҵ带 ���� �� ���� ���� ���� ������
		//p1.name = "��浿";
		
		Person p2 = new Person();//�̷� ������ ���� ��üȭ�Ѵٰ� ǥ���մϴ�.
		
		p2.age = 22;
		p2.setName("�ڱ浿");
		
		Person p3 = new Person();
		
		p3.age = 23;
		p3.setName("ȫ�浿");
		
	}

}
