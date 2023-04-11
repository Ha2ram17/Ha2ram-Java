package main;

public class Adad {

	public static void main(String[] args) {
		System.out.println("Hello world"); //System안에 있는 Out 안에 있는 println
		System.out.println("Hello world!"); //ln은 줄바꿈의 여부이다. 
		System.out.println("3+5="); //3+5를 문자열로 인식한다.
		System.out.println(3+5); //3+5를 계산하여 출력한다.
		int a = 18; //정수형으로 변수를 지정해준다.
		int 에이 = 18; //정수형으로 변수를 한국어로 지정해준다.
		System.out.println(a); //변수를 출력해보자
		System.out.println(에이); //""
		int 생일 = 20070914; //변수에 내 생일을 저장해보자
		System.out.println(생일); //변수를 출력해보자
		//int형으로 정수형 변수를 하나 만들면, int형 변수는 32비트짜리이다. 정수형 변수는 주로 int를 사용함.
		//long으로 정수형 변수를 하나 만들면, iong형 변수는 64비트짜리이다. 
		//자바는 소수를 더블로 인식함. float는 오차없이 7자리, double은 15자리까지 인식한다.
		//실수형은 double을 주로 사용한다.
		//문자형은 String으로 지정할 수 있다.
		final int GG = 100; //final을 붙히고 변수를 만들면, 바꾸지 못한다. 그리고 파이널 변수는 대문자로 해야한다.

	}

}
