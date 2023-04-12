package dasa;

public class Chou {

	public static void main(String[] args) {
		//기본형 (ex.int,long)
		//기본형은 실제 값을 저장하는 것이 특징이다.
		//참조형은 변수의 주소값을 저장하는것이 특징이다.
		//기본형 변수 - '권세준'
		//참조형 변수 - 11203
		//short = 숫자를 담는 변수
		//char = 문자를 담는 변수
		//대문자로 시작하는 String의 경우, 참조형 변수로 인식한다. 
		//변수의 명명규칙 - 1. 대소문자가 구분되며 길이에 제한이 없다.
		//2. 예약어는 사용해서 안된다 등등
		//변수 : 하나의 값을 저장하기 위한 공간. 상수 : 값을 한번만 저장할 수 있는 공간, 리터럴 : 그 자체로 값을 의미하는 것.
		int a = 0;
		int b = 0;
		a = 18;
		b = 99;
		System.out.println("a는 "+a+" 이고, b는 "+b+"이다.");
		System.out.println("두 변수의 값을 바꿉니다.");
		int c = 0;
		c = a;
		a = b;
		b = c;
		System.out.println("a와 b의 값을 바꿉니다.");
		System.out.printf("a는 %d이고, b는 %d이다.\n", a, b);
		System.out.println("printf는 파이썬의 .format과 같다!");
		
	    

	}

}
