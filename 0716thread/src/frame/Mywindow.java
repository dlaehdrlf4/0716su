package frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Panel;

public class Mywindow extends Frame {
	//������
	public Mywindow() {
		this.setBackground(Color.BLUE);
		setSize(1000,1000);
		setLocation(500,500);
		setTitle("ù��° ������");
		
		Panel panel = new Panel();
		
		Button button = new Button("��ư1");
		//ColorThread th1 = new ColorThread(button);
		Thread th1 = new Thread() {
			public void run() {
				Color [] colors =  {Color.blue,Color.black,Color.red};
				
				int idx = 0;
				while(true) {
					try {
						//colors �迭 ���� ���� �����ϱ�
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
		
		Button button2 = new Button("��ư2");
		//��ư�� �ؽ�Ʈ�� �����ϴ� ������
		//TextThread th2 = new TextThread(button2);
		
		Thread th2 = new Thread() {
			
			public void run() {
				String [] ar = {"����","�Ϳ�","����"};
				
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
		//�г��� �����ӿ� �߰�
		
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
		
		
		
	/*	Dialog dialog = new Dialog(this,"��ȭ����");
		//dialog.setTitle("��ȭ����");
		dialog.setSize(500, 500);
		dialog.setBackground(Color.BLACK);
		*/
	}
}
