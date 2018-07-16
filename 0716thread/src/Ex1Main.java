
public class Ex1Main {

	public static void main(String[] args) {
		//클래스 사용 // ThreadEx1에 run에 스태틱이 없을때 첫번째 인스턴스 생성해야함
		//그리고 인스턴스 생성할 때 생성자가 없으면 빈가로가 들어가고 생성자가 있으면 
		//그에 맞는 것을 만들어 주어야함
		
		//클래스의 run 메소드 사용
		ThreadEx1 ex = new ThreadEx1();
		//데몬 스레드로 설정
		//다른 스레드가 작업 중이 아니면 자동 종료
		ex.setDaemon(true);
		//스레드 시작
		
		ex.start();
		
		try {
			Thread.sleep(2000);
			//InterrupteException을 발생시킵니다.
			ex.interrupt();
			Thread.sleep(3000);
			System.out.println("메인종료");
			//프로그램 종료
			//System.exit(0);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
			// 메시지 추가하는 것을 한다.
			e.printStackTrace();
			return;
			
		}
		
		
		
	}

}
