
public class ForEx {

	public static void main(String[] args) {
		//�ڹٿ��� �ݺ��� ��� : for, while, do~while
		
		//for (�ʱ�ȭ; ����; ������) {�ݺ��� �ڵ�}
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println( i );
//		}
		
		for (int i = 2; i < 10; i++) { //i�� �������� ����, k�� �ڿ� ���ϴ� ����
			for (int k = 1; k < 10; k++) {
				int result = i * k;
				System.out.println(i + "x" + k + "=" + result + "�Դϴ�.");
			}
			System.out.println();
		}

	}

}
