import java.util.Scanner;

public class fGA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자1을 지정하세요.");
        int 숫자1 = sc.nextInt();
        System.out.println("숫자2를 지정하세요.");
        int 숫자2 = sc.nextInt();
        //+,-,*,/
        System.out.println("+,-,*,/ 중 하나를 입력해주세요.");
        String 연산자 = sc.next();
        switch (연산자) { //스위치뒤에 괄호 속, 매개변수를 입력한다
		case "+": //case는 if와 else if와 같다.
			System.out.println(숫자1 + 숫자2);
			break;
		case "-":
			System.out.println(숫자1 - 숫자2);
			break;
		case "*":
			System.out.println(숫자1 * 숫자2);
			break;
		case "/":
			System.out.println(숫자1 / 숫자2);
			break;
		default:
			System.out.println("위에 있는 기호들을 제대로 입력하지 않았어!");
			break; //이상 스위치 케이스에 대해 공부해봤다. 
		}
	}

}
