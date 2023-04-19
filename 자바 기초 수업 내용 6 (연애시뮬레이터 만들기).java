import java.util.Scanner;

/**
 * 
 */

/**
 * @author user
 *
 */
public class Gda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//라면 끓이기 
		System.out.println("라면을 끓여보자!");
		System.out.println("물 끓이기!");
		Scanner sc = new Scanner(System.in);
		System.out.println("가스레인지 앞에 섰다.");
		System.out.println("1. 불을 킨다. 2. 귀찮다 그냥 생라면을 부숴먹자!.");
		int n = sc.nextInt(); //n을 입력받고 그에 따른 if문을 작성한다.
		if(n==1) {
			System.out.println("정말 맛있게 조리해주지 !!"); //멋있는 대사!!
			System.out.println("1. 스프를 먼저 넣는다. 2. 라면을 먼저 넣는다.");//선택지를 줄 수 있다
			int a = sc.nextInt(); //a를 입력받고 그에 따른 반응을 if문으로 작성해본다!
			if(a==1) {
				System.out.println("라면이 굉장히 맛있게 조리되었어 헤헤"); //멋있는 대사!!
			}else {
				System.out.println("라면은 그적저럭 먹을만하네..."); //라면 먼저 넣으니까 맛이 없는거야
			}
			//자바의 조건문은 조건 작성 후,{}중괄호를 사용해야 아래 실행 블록을 2줄 이상 인식한다. 
		        //꼭 주의해서 작성할 것 !
			//if문과 else문을 이용한 간단한 게임을 만들어봤다.
		        //파이썬처럼 elif문을 쓰려면 else if()로 해야 알아먹는다. 이 점을 주의!
		} else {
			System.out.println("그냥 부숴먹어야지 헤헤");
		}
		System.out.println("배부르다 ㅎㅎㅎㅎ");
			
		
		
		

	}

}
