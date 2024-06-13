package jabba;

public class Phone_main {

	public static void main(String[] args) {
		Phone pe = new Phone();
		Phone_ex pex = new Phone_ex("갤럭시 S1023","블랙",512);
		Phone_ex pex1 = new Phone_ex();
		String mes = "Null";
		pe.벨();
		pex.벨();
		pe.음성보내기(mes);
		pex.상태();
		pex1.상태();

	}

}
