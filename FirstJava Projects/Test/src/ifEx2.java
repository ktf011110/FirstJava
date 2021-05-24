
public class ifEx2 {
	
	public static void main(String args[]) {
		
		int x = 30;
		int y = 120;
		
		if (x > y & (x += 100) > 10) { //x가 y보다 크고(and) x가 10보다 크다
			System.out.println("x가 y보다 크다");
		}
		
		System.out.println( x );
	}

}

