
//오버로딩(overloading)
//메소드 이름이 같아도 오류가 발생하지 않음
//but, 파라미터 종류 혹은 개수가 무조건 달라야 함(메소드 오버로딩의 규칙)
//언제 쓰냐 - 같은 기능을 하지만 파라미터 종류/개수가 다른 경우

class CalMethod {
	
	public void add(int x, int y) {
		int result = x + y;
		System.out.println( result );
		//println() 역시 오버로딩되어 있기 때문에 어떤 파라미터 값을 넣어도 동작함
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



//오버라이딩(overriding)
//상위 클래스로부터 상속받은 메소드 기능 재정의
// 문법적으로 상위 클래스로부터 물려받은 메소드를 그대로 사용하고 기능만 재정의
// (단, 접근 제한자는 보다 넓은 범위의 접근 제한자로 변경 가능)



class CalMethod2 extends CalMethod {
	public void add(int x, int y) {
		//상위 클래스에서 물려받은 메소드의 기능을 변경 : 오버라이딩
		int result = x + y;
		System.out.println( "덧셈의 결과는 : " + result );
	}
}



public class MethodEx2 {
	public static void main(String[] args) {
		CalMethod c = new CalMethod();
		c.add(10, 20);
		
	}

}
