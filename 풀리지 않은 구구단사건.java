import java.util.Scanner;

public class Dsdad {

	public static void main(String[] args) {
		int a = 0;
		Scanner scan = new Scanner(System.in);
		int 몇단 = scan.nextInt();
		System.out.println("몇까지 곱할래?");
		int 곱할수 = scan.nextInt();
		int i = 1;
		while(i<=곱할수) {
			System.out.println(몇단+"*"+i+"="+(몇단*i));
			i++;
		}
		System.out.println("------------------");
		for(i=1; i<=곱할수; i++) {
			System.out.println(몇단+"*"+i+"="+(몇단*i));
		}
		System.out.println("------------------");
		int 며딴 = scan.nextInt();
		int 고팔수 = scan.nextInt();
		for(int t=2; t<=몇단; t++) {
			for(i=1; i<=곱할수; i++) {
		       System.out.println(t+"*"+i+"="+(t*i));
			   i++;
		}
		}
	}

}
