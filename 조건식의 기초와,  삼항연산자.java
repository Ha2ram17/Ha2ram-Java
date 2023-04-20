package Ddsfg;

public class Ggd {

	public static void main(String[] args) {
		int 아무거나 = 18;
		int 아무거나더하기일 = ++아무거나;
		System.out.println("++아무거나:"+아무거나더하기일);
		아무거나더하기일 = ++아무거나;
		System.out.println("++아무거나:"+아무거나더하기일);
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = (long)a * b; //2_000_000_000_000
		System.out.println(c); //아하!!!!
		
		//삼항연산자를 활용한다. (조건식) ? 식1 : 식2
		
		//조건식 = 홀짝을 판별하는 식(나머지 연산자 %)
		
		//홀인지 짝인지를 판단해서 출력하기
		int num = 18;
		String 결과 = "";
		결과 = (num%2==0)? "짝수":"홀수";
		System.out.println(결과);
			

	}

}
