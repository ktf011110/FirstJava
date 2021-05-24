//자바의 함수 = 메소드
//메소드 가장 큰 목적 : 재활용
//중복되는 코드 제거를 위해 사용
//(1.)메소드 정의

class MyMethod {
	
	//메소드 문법
	//접근제한자 리턴형 메소드이름(파라미터 정의 (뭘 받아올거냐)) { ... 코드 }
	//접근 제한 : public - protected - default - private
	//리턴형 : void - 리턴값이 없음
	//        기본자료형
	//          객체형
	//        리턴이 정해진 경우(void가 아닌 경우)에는 코드 내 "return" 문법을 사용해 값을 넘겨줄 것
	
	public int add(int x, int y) {
		int result = x + y;
		System.out.println( result );
		return result;
	}
	
}

public class MethodEx {
	
	public static void main(String args[]) {
		
		//(2) 정의된 메소드 사용
		//메소드를 CPU가 접근할 수 있도록 메모리에 올려줘야 함
		//자바에선 메소드, 변수만 메모리에 올릴 수는 없고 클래스를 통째로 올려 줘야 함
		//따라서 add() 메소드가 포함된 MyMethod 클래스를 메모리에 옮기는 작업이 우선 필요
		//MyMethod 클래스를 메모리에 올리기 위해 다음 코드가 필요함
		MyMethod m = new MyMethod();
		 m.add(2, 3);
		
	}

}
