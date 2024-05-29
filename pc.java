package jdbc;

import java.util.Scanner;

public class pc {
	item it = new item();
	Scanner sc = new Scanner(System.in);
	String 이름;
	int 공격력;
	int 체력;
	int 마나;
	
	int 주현맘공격력;
	int 주현맘마나;
	int 주현맘체력;
	//스탯 선언
	public int get주현맘공격력() {
		return 주현맘공격력;
	}
	public void set주현맘공격력(int 주현맘공격력) {
		this.주현맘공격력 = 주현맘공격력;
	}
	public int get주현맘마나() {
		return 주현맘마나;
	}
	public void set주현맘마나(int 주현맘마나) {
		this.주현맘마나 = 주현맘마나;
	}
	public int get주현맘체력() {
		return 주현맘체력;
	}
	public void set주현맘체력(int 주현맘체력) {
		this.주현맘체력 = 주현맘체력;
	}
	public String get이름() {
		return 이름;
	}
	public void set이름(String 이름) {
		this.이름 = 이름;
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
	public int get마나() {
		return 마나;
	}
	public void set마나(int 마나) {
		this.마나 = 마나;
	}
	
	//메소드(행동)
	void 공격(String g, int j, String v, int b) { //이름, 공격력 - 몬스터 이름, 몬스터 체력
		System.out.printf("%s가 %s를 공격합니다.\n",g,v);
		b -= j;
		System.out.printf("%s의 체력이 %s가 되었습니다.\n",v,b);
		set주현맘체력(b);
	}
	
	void skill_1(String 이름, int 마나, int 주현맘체력) {
		System.out.printf("%s이(가) 주현맘을 공격합니다.\n",이름);
		마나 -= 30;;
		주현맘체력 -= 40;
		set마나(마나);
		set주현맘체력(주현맘체력);
		System.out.println("마나를 30 사용했습니다.");
		System.out.printf("몬스터 주현맘의 체력은 %d남았습니다.",주현맘체력);
		System.out.println();
		}
	void 주현맘의공격(int j, int k) {
		System.out.println("");
		System.out.println("주현맘이 플레이어를 공격했습니다.");
		System.out.printf("주현맘의 공격으로 인해 생명력이 %s감소했습니다.",j);
		k-=j;
		System.out.println("");
		System.out.printf("현재 생명력이 %s남았습니다.",k);
		set체력(k);
	}
	void 아이템사용(int hp, int mp, int atk) { //체력포션, 마나포션, 해독제, 공격력상승, 체력, 마나, 상태, 공격력
		int a = it.get체력포션();
		int b = it.get마나포션();
		int c = it.get공격력상승();
		int d = a+b+c;
		System.out.printf("현재 보유중인 체력포션의 개수는 %s입니다.",a);
		System.out.println("");
		System.out.printf("현재 보유중인 마나포션의 개수는 %s입니다.",b);
		System.out.println("");
		System.out.printf("현재 보유중인 공격력상승의 개수는 %s입니다.",c);
		System.out.println("");
		System.out.println("체력포션 사용 : 1\n마나포션 사용 : 2\n공격력상승 사용 : 3");
		while(true) {
			String use1 = sc.next();
			if(use1.equals("1")) {
				if(a<=0) {
					System.out.println("아이템의 소지 개수가 부족합니다.");
				}
				else if(d<=0) {
					System.out.println("사용가능한 아이템이 없습니다.");
					break;
				}
				else {
					a-=1;
					System.out.println("체력포션을 사용합니다.");
					System.out.println("체력이 50 회복되었습니다.");
					hp += 50;
					System.out.printf("현재 체력은 %s입니다.",hp);
					System.out.println("");
					System.out.printf("현재 포션의 개수는 %s개 남았습니다.",a);
					System.out.println("");
					it.set체력포션(a);
					set체력(hp);
					break;
				}
			}
			else if(use1.equals("2")) {
				if(b<=0) {
					System.out.println("아이템의 소지 개수가 부족합니다.");
				}
				else if(d<=0) {
					System.out.println("사용가능한 아이템이 없습니다.");
					break;
				}
				else {
					b-=1;
					System.out.println("마나포션을 사용합니다.");
					System.out.println("마나가 100 회복되었습니다.");
					mp += 100;
					System.out.printf("현재 마나는 %s입니다.",mp);
					System.out.println("");
					it.set마나포션(b);
					set마나(mp);
					break;
				}
			}
			else if(use1.equals("3")) {
				if(use1.equals("3")) {
					if(c<=0) {
						System.out.println("아이템의 소지 개수가 부족합니다.");
					}
					else if(d<=0) {
						System.out.println("사용가능한 아이템이 없습니다.");
						break;
					}
					else {
						c -=1;
						System.out.println("공격력포션을 사용합니다.");
						System.out.println("공격력이 5 상승되었습니다.");
						atk += 5;
						System.out.printf("현재 공격력은 %s입니다.",atk);
						System.out.println("");
						it.set공격력상승(c);
						set공격력(atk);
						break;
					}
				}
			}
			else {
				System.out.println("잘못된 값을 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	
	
}