package jabba;

public class Phone_ex extends Phone {
	public boolean wifi;
	
	public Phone_ex() {
		this.모델="Null";
		this.색상="Null";
		this.저장공간=404;
	}
	
	public Phone_ex(String 모델, String 색상, int 저장공간) {
		this.모델=모델;
		this.색상=색상;
		this.저장공간=저장공간;
	}
	
	public void 상태() {
		System.out.printf("기종 : %s \n색상 : %s\n저장공간 : %dGB",get모델(),get색상(),get저장공간());
		System.out.println("\n");
	}
	
	
	
	@Override
	public void 벨() {
		super.벨();
		for(int i=0; i<=5; i++) {
			System.out.println("주현맘!! 일어나시오 일어나시오!!");
		}
		System.out.println("");
	}

	@Override
	public void 음성보내기(String 메세지) {
		super.음성보내기(메세지);
	}

	@Override
	public void 음성받기(String 메세지) {
		super.음성받기(메세지);
	}

	@Override
	public void 끊기() {
		super.끊기();
	}

	public void set와이파이(boolean 와이파이) {
		this.wifi=와이파이;
		System.out.println("와이파이 상태를 변경합니다.");
	}
	
	public void 인터넷() {
		System.out.println("인터넷에 연결합니다.");
	}
}
