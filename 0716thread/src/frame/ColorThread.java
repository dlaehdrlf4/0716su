package frame;

import java.awt.Button;

import com.sun.prism.paint.Color;

public class ColorThread extends Thread {
	// �ۿ��� ������ �Ѱܹ�������
	private Button button;
	
	public ColorThread(Button button) {
		this.button = button;
	}	
	
	/*public void run() {
		//���� �迭�� ����
		Color [] colors = {Color.RED,Color.BLUE,Color.GREEN};
		int idx = 0;
		while(true) {
			try {
				//colors �迭 ���� ���� �����ϱ�
				idx = idx + 1;
				button.setBackground(idx%colors.length);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		}*/
	}

