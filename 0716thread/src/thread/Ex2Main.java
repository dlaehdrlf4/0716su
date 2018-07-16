package thread;

public class Ex2Main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		//스레드 인스턴스 만들기
		ThreadEx2 atm = new ThreadEx2(bank,"ATM");
		atm.start();
		
		ThreadEx2 Internet = new ThreadEx2(bank,"Internet");
		Internet.start();
		
	}

}
