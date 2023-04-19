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
		int n = sc.nextInt();
		if(n==1) {
			System.out.println("정말 맛있게 조리해주지 !!");
			System.out.println("1. 스프를 먼저 넣는다. 2. 라면을 먼저 넣는다.");
			int a = sc.nextInt();
			if(a==1) {
				System.out.println("라면이 굉장히 맛있게 조리되었어 헤헤");
			}else {
				System.out.println("라면은 그적저럭 먹을만하네...");
			}
			
			
		} else {
			System.out.println("그냥 부숴먹어야지 헤헤");
		}
		System.out.println("배부르다 ㅎㅎㅎㅎ");
			
		
		
		

	}

}
