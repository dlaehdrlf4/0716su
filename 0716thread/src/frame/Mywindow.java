package frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Panel;

public class Mywindow extends Frame {
	//생성자
	public Mywindow() {
		this.setBackground(Color.BLUE);
		setSize(1000,1000);
		setLocation(500,500);
		setTitle("첫번째 윈도우");
		
		Panel panel = new Panel();
		
		Button button = new Button("버튼1");
		//ColorThread th1 = new ColorThread(button);
		Thread th1 = new Thread() {
			public void run() {
				Color [] colors =  {Color.blue,Color.black,Color.red};
				
				int idx = 0;
				while(true) {
					try {
						//colors 배열 안의 값만 선택하기
						idx = idx + 1;
						button.setBackground(colors[idx%colors.length]);
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		};
		th1.start();
		panel.add(button);
		//add(button);
		
		Button button2 = new Button("버튼2");
		//버튼의 텍스트를 변경하는 스레드
		//TextThread th2 = new TextThread(button2);
		
		Thread th2 = new Thread() {
			
			public void run() {
				String [] ar = {"동길","와우","오예"};
				
				int idx = 0;
				while(true) {
					try {
						Thread.sleep(1000);
						idx = idx + 1;
						button2.setLabel(ar[idx%ar.length]);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		th2.start();
		
		panel.add(button2);
		//패널을 프레임에 추가
		
		add(panel);
		add(panel);
		
		setVisible(true);
		
		/*int sign = 1;
		while(true) {
			try {
				Thread.sleep(1000);
				if(sign > 0) {
					button.setBackground(Color.yellow);
				}
				else {
					button.setBackground(Color.blue);
				}
				sign = - sign;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		
		
	/*	Dialog dialog = new Dialog(this,"대화상자");
		//dialog.setTitle("대화상자");
		dialog.setSize(500, 500);
		dialog.setBackground(Color.BLACK);
		*/
	}
}
