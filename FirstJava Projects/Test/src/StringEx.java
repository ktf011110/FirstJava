
public class StringEx {

	public static void main(String[] args) {

		//String 클래스의 두 가지 특징
		
		
		//(1) 암묵적인 객체 생성을 지원
		
		//본래 String 클래스 사용 시 new(객체화) 하고 쓰는 것이 원칙임.
		String str1 = "ABC"; // == new String("ABC");
		//암시적인 객체 생성. 원칙에 맞지 않지만 자바에서 자동으로 지원해 주는 문법.
		String str2 = new String("ABC");
		//기본 자료형이 아니니까 주소가 들어감!
		
		if (str1 == str2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		//str1 안에는 ABC의 주소가 있음. str2에는 새로운 ABC의 주소가 있음.  => 주소가 다르기 때문에 다르다고 출력
		//실제 값을 비교하고 싶다면 if( str1.equals(str2) ) 처럼 equals 메소드를 사용해야 함.
		
		//그러나 str1처럼 암시적인 객체 생성으로만 만들어낸 변수를 비교하면 같다고 출력됨.
		//암시적인 객체 생성을 이용해도 주소 값이 들어가는 것은 동일하다. 암시적 방법으로 만들 때
		//ABC라는 값이 메모리에 있는지 찾아보는 기능이 있기 때문에 새로 만들지 않고 같은 주소를 가져오기 때문임.
		//그래도 문자열 비교는 아니기 때문에 그냥 저런 if문은 사용하지 않는 것이 좋음.
		
		//(2) 불변적인 특징을 지니고 있음 : 값 변경이 불가
		String x = "ABC";
		x = x + "DEF"; //"ABC" , "ABCDEF"
		x = x + "G"; //"ABC" , "ABCDEF" , "ABCDEFG" 새로운 공간에 저장해 세 개가 매모리에 존재하게 됨
		// 자바에서 문법적으로 객체 할당(new)는 존재하나
		//반대 개념인 객체 해제는 문법적으로 존재하지 않음.
		//대신 GC(Garbage Collector)가 불필요한 메모리 자원을 해제해준다.
		
		//따라서 String class를 변경이 빈번하게 일어나는 문자열 저장을
		//위해 사용하면 성능 저하 또는 불필요한 메모리릭 문제가 생길 수 있음
		//하드웨어 지원이 PC에 비해 상대적으로 부족한 모바일에서는 문자열 변경이 자주 일어나는 경우 String 클래스를 사용하지 말 것
		//대신 StringBuffer class 등을 사용할 것
		System.out.println( x );
		
		
	}

}
