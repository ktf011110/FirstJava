
class Person {
	int age;
	private String name;
	
	public void setName(String n) {//함수(메소드)는 재활용을 위해 쓰는 것임
		name = n+"님";
	}
}

public class OOPEx2 {

	public static void main(String[] args) {
		
		Person p1 = new Person();//기본 자료형이 아니므로 p1의 주소가 삽입된다.
		p1.age = 20;
		p1.setName("김길동"); //이런 식으로 만들면? 아래 주석 코드는 유지보수가 번거롭지만, 이 코드는 메소드를 통해 다 같이 유지 보수 가능함
		//p1.name = "김길동";
		
		Person p2 = new Person();//이런 구문을 보고 객체화한다고 표현합니다.
		
		p2.age = 22;
		p2.setName("박길동");
		
		Person p3 = new Person();
		
		p3.age = 23;
		p3.setName("홍길동");
		
	}

}
