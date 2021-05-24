
public class ForEx {

	public static void main(String[] args) {
		//자바에서 반복문 사용 : for, while, do~while
		
		//for (초기화; 조건; 증감식) {반복할 코드}
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println( i );
//		}
		
		for (int i = 2; i < 10; i++) { //i는 곱해지는 숫자, k는 뒤에 곱하는 숫자
			for (int k = 1; k < 10; k++) {
				int result = i * k;
				System.out.println(i + "x" + k + "=" + result + "입니다.");
			}
			System.out.println();
		}

	}

}
