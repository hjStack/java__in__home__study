
//1-100까지 더하기

package chap01;

public class b {
	public static void main(String[] args) {
		int sum=0;
		int i=1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("합은 " + sum);
	}
}
