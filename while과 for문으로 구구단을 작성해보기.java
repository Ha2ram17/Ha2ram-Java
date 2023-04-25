import java.util.Scanner;

public class Dsdad {

	public static void main(String[] args) {
		int a = 0;
		Scanner sc = new Scanner(System.in);
        System.out.println("몇단을 보고 싶은데?");
        
        int 몇단 = sc.nextInt(); //2
        
        System.out.println(몇단+" * 1 ="+(몇단*1));
        
        int 곱 =1;
        while(곱<=9) {
        	System.out.println(몇단+" * "+곱+" = "+(몇단*곱));
        	곱++;
        }
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("");
        for(int i = 1; i<=9; i++) {
        	System.out.println(몇단+" * "+i+" = "+(몇단*i));
        }
	}

}
