
public class Test2 {
	
	int x = 10;
	//기말고사에 완전히 똑같은 코드 등장

	public static void main(String[] args) {
		
		System.out.println( x );

	}
	
	//이 코드의 문제점을 찾아내시오.
	//중간고사에 관련 문제 등장 (객관식)
	
	// x는 CPU가 출력해 주는데, CPU는 x를 메모리에서 찾을 수 없다. 
	//x 변수는 main 메소드 밖에 있기 때문에 메모리에 올라오지 않기 때문이다.
	
	//만약 메인 메소드 밖의 x를 메모리에 올려 주려면 main 함수 안에서 Test2 t = new Test2();로 전체를 메모리에 올려준 후,
	//println( x );를 println( t.x );로 바꿔 주어 Test2 내부의 x 변수라는 사실을 알려 주면 출력할 수 있다.
	
}
