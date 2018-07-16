package frame;

import java.awt.Button;

public class TextThread extends Thread {
	
	private Button button1;
	
	public TextThread(Button button1) {
		this.button1 = button1;
	}
	
	public void run() {
		
		String [] ar = {"dong","vkvkvk","oyoy"};
		
		int idx = 0;
		while(true) {
			try {
				
				Thread.sleep(1000);
				idx = idx +1;
				button1.setLabel(ar[idx%ar.length]);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
