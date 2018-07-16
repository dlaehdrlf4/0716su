package thread;

public class Bank {
	// 잔액을저장할 변수
	private int balance = 1000;

	// 잔액을 변경하는 메소드
	public void job(String msg) {
		//this - 내 자신의 자원을 사용하는 경우
		//이 코드는 한번에 수행되도록 설정
		synchronized (this) { // 동시에 작업을 못하게 할때
			System.out.println(msg + "현재 잔액:" + balance);
			balance = balance - 100;
			// 1초 대기
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(msg + "작성 후 현재 잔액:" + balance);
		}
	}
}