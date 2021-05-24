
public class IfEx {
	
	public static void main(String args[]) {
		
		//제어문 : if  else
		int score = 70;
		
		if(score >= 90) { //만약 x가 90보다 크거나 같다면 
			System.out.println("A");
		}
		else if(score >= 80) { //만약 x가 80보다 크거나 같다면
			System.out.println("B");
		}
		else if(score >= 70) { 
			System.out.println("C");
		}
		else if(score >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
	}

}
