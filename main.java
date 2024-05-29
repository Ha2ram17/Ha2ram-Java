package jdbc;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		monster mo = new monster();
		Scanner sc = new Scanner(System.in);
		System.out.println("게임을 시작합니다.");
		System.out.println("사용자의 이름을 입력받습니다.");
		String name = sc.next();
		hero h1 = new hero(name,30,50,30);
		System.out.printf("몬스터 %d를 조우했습니다. 곧 전투를 시작합니다.",mo.get이름());
		System.out.println();
		while(true){
			System.out.println("");
		}
	}

}
