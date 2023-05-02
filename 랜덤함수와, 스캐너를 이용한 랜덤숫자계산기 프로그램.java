import java.util.Random;
import java.util.Scanner;

public class ADa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("------------------");
		System.out.println("랜덤 계산기를 실행하기 (1), 랜덤 계산기를 종료하기 (2)");
		System.out.println("------------------");
		int a = sc.nextInt();
		if(a==1) {
			System.out.println("랜덤한 숫자를 양수로 한도를 설정해주세요.");
			int 랜덤숫자 = sc.nextInt();
			 if(랜덤숫자>0) { 
			  System.out.printf("랜덤숫자의 한도는 %d입니다!",랜덤숫자);
			  System.out.println("");
			  int 랜덤숫자결과물 = rd.nextInt(랜덤숫자);
			  System.out.printf("도출된 랜덤한 숫자는.. %d!",랜덤숫자결과물);
			  System.out.println("");
			  //--------------
			  System.out.println("두번째 랜덤한 숫자를 양수로 한도를 설정해주세요.");
			  int 랜덤숫자2 = sc.nextInt();
			  if(랜덤숫자2>0) { 
			  System.out.printf("두번째 랜덤숫자의 한도는 %d입니다!",랜덤숫자2);
			  System.out.println("");
			  int 랜덤숫자결과물2 = rd.nextInt(랜덤숫자2);
			  System.out.printf("도출된 랜덤한 숫자는.. %d!",랜덤숫자결과물2);
			  System.out.println("");
			  System.out.println("연산자를 선택해주세요.");
			  System.out.println("(1) +, (2) -, (3) x, (4) % 중 선택해주세요");
			  int 연산자선택 = sc.nextInt();
			  if(연산자선택==1) {
				  System.out.println(랜덤숫자결과물+랜덤숫자결과물2);
			  } else if (연산자선택==2) {
				  System.out.println(랜덤숫자결과물-랜덤숫자결과물2);
			  } else if (연산자선택==3) {
				  System.out.println(랜덤숫자결과물*랜덤숫자결과물2);
			  } else if (연산자선택==4) {
				  System.out.println(랜덤숫자결과물/랜덤숫자결과물2);
			  }else {
				  System.out.println("연산자가 올바르게 선택되지 않아 실행이 불가능합니다.");
			  }
			  }else {
				  System.out.println("두번째 랜덤숫자의 한도를 제대로 입력하지 않았습니다.");
			  }
			 }else {
				 System.out.println("제대로 된 한도를 입력하지 않았습니다.");
			 }
		}else {
			System.out.println("랜덤계산기를 종료합니다.");
		}
		
		
		
		
	}

}
