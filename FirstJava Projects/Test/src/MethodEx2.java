
//�����ε�(overloading)
//�޼ҵ� �̸��� ���Ƶ� ������ �߻����� ����
//but, �Ķ���� ���� Ȥ�� ������ ������ �޶�� ��(�޼ҵ� �����ε��� ��Ģ)
//���� ���� - ���� ����� ������ �Ķ���� ����/������ �ٸ� ���

class CalMethod {
	
	public void add(int x, int y) {
		int result = x + y;
		System.out.println( result );
		//println() ���� �����ε��Ǿ� �ֱ� ������ � �Ķ���� ���� �־ ������
	}
	
	public void add(double x, double y) {
		double result = x + y;
		System.out.println( result );
	}
	
	public void add(double x, double y, double z) {
		double result = x + y + z;
		System.out.println( result );
	}
}



//�������̵�(overriding)
//���� Ŭ�����κ��� ��ӹ��� �޼ҵ� ��� ������
// ���������� ���� Ŭ�����κ��� �������� �޼ҵ带 �״�� ����ϰ� ��ɸ� ������
// (��, ���� �����ڴ� ���� ���� ������ ���� �����ڷ� ���� ����)



class CalMethod2 extends CalMethod {
	public void add(int x, int y) {
		//���� Ŭ�������� �������� �޼ҵ��� ����� ���� : �������̵�
		int result = x + y;
		System.out.println( "������ ����� : " + result );
	}
}



public class MethodEx2 {
	public static void main(String[] args) {
		CalMethod c = new CalMethod();
		c.add(10, 20);
		
	}

}
