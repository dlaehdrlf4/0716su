package frame;

import java.awt.Button;

import com.sun.prism.paint.Color;

public class ColorThread extends Thread {
	// 밖에꺼 쓰려고 넘겨받은거임
	private Button button;
	
	public ColorThread(Button button) {
		this.button = button;
	}	
	
	/*public void run() {
		//색상 배열을 생성
		Color [] colors = {Color.RED,Color.BLUE,Color.GREEN};
		int idx = 0;
		while(true) {
			try {
				//colors 배열 안의 값만 선택하기
				idx = idx + 1;
				button.setBackground(idx%colors.length);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		}*/
	}

