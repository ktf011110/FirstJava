//�ڹ��� �Լ� = �޼ҵ�
//�޼ҵ� ���� ū ���� : ��Ȱ��
//�ߺ��Ǵ� �ڵ� ���Ÿ� ���� ���
//(1.)�޼ҵ� ����

class MyMethod {
	
	//�޼ҵ� ����
	//���������� ������ �޼ҵ��̸�(�Ķ���� ���� (�� �޾ƿðų�)) { ... �ڵ� }
	//���� ���� : public - protected - default - private
	//������ : void - ���ϰ��� ����
	//        �⺻�ڷ���
	//          ��ü��
	//        ������ ������ ���(void�� �ƴ� ���)���� �ڵ� �� "return" ������ ����� ���� �Ѱ��� ��
	
	public int add(int x, int y) {
		int result = x + y;
		System.out.println( result );
		return result;
	}
	
}

public class MethodEx {
	
	public static void main(String args[]) {
		
		//(2) ���ǵ� �޼ҵ� ���
		//�޼ҵ带 CPU�� ������ �� �ֵ��� �޸𸮿� �÷���� ��
		//�ڹٿ��� �޼ҵ�, ������ �޸𸮿� �ø� ���� ���� Ŭ������ ��°�� �÷� ��� ��
		//���� add() �޼ҵ尡 ���Ե� MyMethod Ŭ������ �޸𸮿� �ű�� �۾��� �켱 �ʿ�
		//MyMethod Ŭ������ �޸𸮿� �ø��� ���� ���� �ڵ尡 �ʿ���
		MyMethod m = new MyMethod();
		 m.add(2, 3);
		
	}

}
