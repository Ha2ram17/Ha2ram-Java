import java.util.Scanner;

public class Dfa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1:메뉴\n2:종료");
		int a = sc.nextInt();
		if(a==1) {
		 System.out.println("1,2,3,4중  원하는 연산자에 해당하는 숫자를 입력해주세요.");
		 System.out.println("1:+\n2:-\n3:x\n4:%");
		 a = sc.nextInt();
		 if(a==1 ) {
			System.out.println("더하기");
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(b+c);
		 }else if(a==2) {
			System.out.println("빼기");
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(b-c);
		 }else if(a==3) {
			System.out.println("곱하기");
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(b*c);
		 }else if(a==4) {
			System.out.println("나누기");
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(b/c);
		 }else {
			System.out.println("올바른 값을 입력해주세요.");
		 }
		}
		else {
			System.out.println("프로그램을 종료합니다.");
		}

	}

}
