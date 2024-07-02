
package chap01;

import java.util.Scanner;

public class f {
	public static void main(String[] args) {
		boolean run=true;
		int balance=0;
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 ");
		
			System.out.println("---------------------------------");
			System.out.print("선택 > ");
			int Menu_num=Integer.parseInt(scanner.nextLine());
			
			switch(Menu_num) {
				case 1:
					System.out.print("예금액> ");
					balance += Integer.parseInt(scanner.nextLine());
					//String to int
					break;
				case 2:
					System.out.print("금액> ");
					balance -= Integer.parseInt(scanner.nextLine());
					break;
				case 3:
					System.out.print("잔고> ");
					System.out.println(balance);
					break;
				case 4:
					run = false;
					break;	
			}
		
		     System.out.println("프로그램 종료합니다.");
			
		}
		 
		
	}
}
