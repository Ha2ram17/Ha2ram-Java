package fffa;

public class Chr {

	public static void main(String[] args) {
		System.out.print("안녕하세요");
		System.out.print("반갑습니다.");//print에 ln이 붙지 않을 경우, 붙어나옴 println = 파이썬의 print
		System.out.println("");
		System.out.println("안녕하세요");
		System.out.println("반갑습니다.");
		System.out.println("");
		System.out.println(3+5);
		System.out.println("3+5");
		System.out.print("3+5 = "); //print에 ln을 붙히지 않음으로써 결과론적으로 아랫 문장과 합쳐져서 3+5 = 8이 나옴.
		System.out.println(3+5);
		System.out.println("3+5 = "+(3+5)); //(3+5)를 먼저 계산해주므로써, java가 문자열로 인식하지않게끔 해서 3+5 = 8이 나오게 함. 
		//만약 ("3+5 ="+ 3+5);로 할 시, 3 + 5 = 35가 나옴 
	}

}
