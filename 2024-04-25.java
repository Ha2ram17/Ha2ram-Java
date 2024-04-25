package ffsfacx;

public class faaasf {

	public static void main(String[] args) {
		
		String 이름 ="정연택";
		String 선생님 = new String("정연택");
		System.out.println(이름==선생님);
		String 주민번호 = "8912071046218";
		char 성별 = 주민번호.charAt(6);
		System.out.println(성별);
		switch (성별) {
		case 1, 3:
			System.out.println("남자");
			break;
		case 2, 4:
			System.out.println("여자");
			break;
		}
		String 변수 ="정,연,택";
		String[] 배열 = 변수.split(",");
		
		for(int i = 0; i<배열.length; i++) {
			System.out.println(배열[i]);
		}
		for(String i: 배열) {
			System.out.println(배열);
		}
		fafsav h1 = new fafsav();
		h1.자기소개();
		h1.키 = 168;
		h1.이름 = "정연택";
		h1.몸무게 = 75;
		
		h1.자기소개();
		
	}

}

package ffsfacx;

public class fafsav {
		int 키;
		int 몸무게;
		String 이름;
		void 자기소개() {
			System.out.printf("제 이름은 %s, 키는 $d, 몸무게는 $d kg입니다.",이름,키,몸무게);
		}

}
