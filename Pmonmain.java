package sw0409;

public class Pmonmain {

	public static void main(String[] args) {
		Pmon 기라티나 = new Pmon("리자몽");
		Pmon 펄기아 = new Qmon("대짱이");

		기라티나.상태창();
		펄기아.상태창();
		
		펄기아.몸통박치기(기라티나);
		기라티나.몸통박치기(펄기아);
		
		
		
	}
}