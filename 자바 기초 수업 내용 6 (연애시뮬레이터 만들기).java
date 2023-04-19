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
			}else if(a!=2){
				System.out.println("아무런 선택지도 선택하지 않다니.. 오늘은 굶어!");//아무런 선택지도 선택하지 않은 사람에게는 배고픔을 벌로 내린다
			}else {
				System.out.println("라면은 그적저럭 먹을만하네..."); //라면 먼저 넣으니까 맛이 없는거야
			}
			
			
		} else if(n!=2) {
			System.out.println("아무런 선택지도 선택하지 않다니.. 오늘은 굶어!");//아무런 선택지도 선택하지 않은 사람에게는 배고픔을 벌로 내린다22
		} else {
			System.out.println("그냥 부숴먹어야지 헤헤");
		}
			
		
		
		

	}

}
