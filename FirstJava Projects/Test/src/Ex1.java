
//�ڹ��� �⺻ �ڷ���
public class Ex1 {
	public static void main(String args[]) {
		
		
		//(1) ������
		//byte - short  - int - long �װ���
		//(1byte) (2)     (4)    (8)
		
		byte b = 127; //�뷮 : 1byte (8 bit) = 256 , -128~127
		
		short s = 128; // �뷮 : 2byte (16 bit) = 512 , -256~255
		
		b = 100;
		int result = b + 1; //�������� ����ó���� ����� int������ ��ȯ
		
		//(2) �Ǽ��� : default ���� double
		//float - double
		double f = 0.1;
		
		//(3) ������
		char c = 'A';
		System.out.println( c );
		char c2 = 65;//�ƽ�Ű�ڵ带 ���� ����
		System.out.println( c2 );
		
		//(4) boolean �� : true or false ���� 
		boolean boo = true; //or false, �ڹٿ����� 0, 1 ���� �Ұ���
	}

}
