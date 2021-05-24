
//자바의 기본 자료형
public class Ex1 {
	public static void main(String args[]) {
		
		
		//(1) 정수형
		//byte - short  - int - long 네가지
		//(1byte) (2)     (4)    (8)
		
		byte b = 127; //용량 : 1byte (8 bit) = 256 , -128~127
		
		short s = 128; // 용량 : 2byte (16 bit) = 512 , -256~255
		
		b = 100;
		int result = b + 1; //정수형을 연산처리한 결과는 int형으로 변환
		
		//(2) 실수형 : default 형은 double
		//float - double
		double f = 0.1;
		
		//(3) 문자형
		char c = 'A';
		System.out.println( c );
		char c2 = 65;//아스키코드를 통한 저장
		System.out.println( c2 );
		
		//(4) boolean 형 : true or false 저장 
		boolean boo = true; //or false, 자바에서는 0, 1 저장 불가능
	}

}
