
public class ThreadEx1 extends Thread {
	// 스레드로 동작할 메소드
	public void run() {

		int i = 0;
		while (i < 10) {
			System.out.println("Thread");
			i = i + 1;
			//1초씩 대기
			//Thread 클래스의 static 메소드인 
			//sleep(시간)을 이용
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				//System.out.println(e.getMessage());
				// 메시지 추가하는 것을 한다.
				//스레드를 강제 종료 할 수 있도록
				//예외가 발생하면 run 메소드 강제 종료
				System.out.println("스레드 종료");
				e.printStackTrace();
				
				return;
				
			}
		}
	}
}