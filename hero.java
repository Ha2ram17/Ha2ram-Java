package jdbc;

import java.util.Random;

public class hero {
	Random rd = new Random();
	monster mo = new monster();
	String 이름;
	int 공격력;
	int 체력;
	int 방어력;
	
	boolean 크리티컬 = false;

	public hero(String title, int a, int b,int c) {
		this.이름=title;
		this.공격력=a;
		this.체력=b;
		this.방어력=c;
	}
	
	public int get공격력() {
		return 공격력;
	}
	public void set공격력(int 공격력) {
		this.공격력 = 공격력;
	}
	public int get체력() {
		return 체력;
	}
	public void set체력(int 체력) {
		this.체력 = 체력;
	}
	public int get방어력() {
		return 방어력;
	}
	public void set방어력(int 방어력) {
		this.방어력 = 방어력;
	}
	
	
	void 공격(int a) { // 공격력
		int b = mo.몬스터체력;
		int c = mo.get몬스터방어력();
		a -= c;
		System.out.println("플레이어가 몬스터를 공격했습니다.");
		b -= a;
		크리티컬(크리티컬);
		if(크리티컬==true) {
			a*=2;
			System.out.println("크리티컬 발동! 치명타가 작렬했습니다. 공격이 2배의 데미지로 입혀집니다.");
		}
		System.out.printf("몬스터는 %s의 데미지를 입었습니다.",a);
		System.out.println("");
		System.out.printf("몬스터의 잔여 체력은 %s입니다!",b);
		mo.set몬스터체력(b);
	}
	
	void 몬스터공격(int a) { // 몬스터공격력
		int b = 체력;
		int c = 방어력;
		a -= c;
		System.out.println("몬스터가 플레이어를 공격했습니다.");
		크리티컬(크리티컬);
		if(크리티컬==true) {
			a*=2;
			System.out.println("크리티컬 발동! 치명타가 작렬했습니다. 공격이 2배의 데미지로 입혀집니다.");
		}
		b -= a;
		System.out.printf("플레이어는 %s의 데미지를 입었습니다.",a);
		System.out.println("");
		System.out.printf("플레이어의 잔여 체력은 %s입니다!",b);
		mo.set몬스터체력(b);
	}
	
	void 크리티컬(boolean a) { //크리티컬 판단용
		int b = rd.nextInt(1,3);
		if(b==3) {
			a = true;
		}
	}
}
