
package chap01;

public class d {
	public static void main(String[] args) {
		
		int n1=(int)(Math.random()*6)+1;
		int n2=(int)(Math.random()*6)+1;
	
		
		while(true) {
			
			if(n1+n2 == 5) {
				System.out.println("(" + n1 + "," + n2 + ")");
				break;
			}
			
			else {
				System.out.println("종료합니다.");
				n1++;
				n2++;
				break;
			}
		}
		
		System.out.println("(" + n1 + "," + n2 + ")");
		
		
	}
}
