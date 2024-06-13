package jabba;

public class Phone {
	public String 모델 = "Null";
	public String 색상 = "Null";
	public int 저장공간 = 404;
	
	public String get모델() {
		return 모델;
	}

	public void set모델(String 모델) {
		this.모델 = 모델;
	}

	public String get색상() {
		return 색상;
	}

	public void set색상(String 색상) {
		this.색상 = 색상;
	}

	public int get저장공간() {
		return 저장공간;
	}

	public void set저장공간(int 저장공간) {
		this.저장공간 = 저장공간;
	}

	
	public void 벨() {
		System.out.println("벨이 울립니다.");
	}
	
	public void 음성보내기(String 메세지) {
		System.out.println("주현맘 : "+메세지);
		System.out.println("");
	}
	
	public void 음성받기(String 메세지) {
		System.out.println("상대방 : "+메세지);
		System.out.println("");
	}
	
	public void 끊기() {
		System.out.println("끊습니다.");
		System.out.println("");
	}
}
