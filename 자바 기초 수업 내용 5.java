package daddd;

import java.util.Scanner;

public class Didddddd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Scanner : 클래스 sc : 인스턴트
		System.out.println(sc.nextInt());
	    //실행했을 때, 결과창에서 사용자가 "정수형"을 입력할때까지 멈춘다.
		//즉, Scanner는 파이썬의 input과 매우 유사한 함수이다.
		int num = sc.nextInt();//num에 정수형을 입력받고,
		System.out.println(num);//num에 입력된 정수를 출력한다.
		//if (조건식) {
		//  조건이 성립할 시 진행될 코드;
		//}
		//*조건식 뒤에는 ;이 없음
		if (num>18)  //num이 18보다 작냐?
			System.out.println("num이 18보다 작네");//조건 성립 시 진행할 코드
		else
			System.out.println("num이 18보다 크네!");//위의 조건이 성립되지 않을 시 진행되는 코드이다.	
		//if에서 조건 성립 시 진행될 코드가 한줄일 경우, 대괄호를 생략해도 되지만,
		//한줄을 초과할 경우, 대괄호도 함께 써주어야한다.
		System.out.println("어찌됐든 '정연택인 나보다' 나약하다");//연택쌤의 한결이급 대사 ! ! !
		int num1 = sc.nextInt("홀짝을 판별할 정수를 입력하세요");
		if (num1%2 == 0)
			System.out.println("짝수입니다."); //홀짝을 판별하는 프로그램 중, 짝수를 건져 출력하는 코드
		else
			System.out.println("홀수입니다."); //홀짝을 판별하는 프로그램 중, 홀수를 건져 출력하는 코드
		
		
		

	}

}
