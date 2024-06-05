package carGame;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {
	private JLabel lblcar1; // 자동차
	private JLabel lblcar2; // 자동차
	private JLabel lblcar3; // 자동차

	int x1 = 100; // 자동차의 출발 x좌표
	int x2 = 100; // 자동차의 출발 x좌표
	int x3 = 100; // 자동차의 출발 x좌표

	class MyThread extends Thread {
				
		public void run() {
			for (int i = 0; i < 120; i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//0.1초에 한 번씩 자동차의 x 위치를 변경한다.
				x1 += (int) (Math.random() * 10);
				lblcar1.setBounds(x1, 0, 100, 100);
				x2 += (int) (Math.random() * 10);
				lblcar2.setBounds(x2, 50, 100, 100);
				x3 += (int) (Math.random() * 10);
				lblcar3.setBounds(x3, 100, 100, 100);
				
			}
		}	
	}
	
	public CarGame() {
		setTitle("CarRace");
		setSize(900, 250); //  윈도우 프레임 크기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		lblcar1 = new JLabel("질풍");
		lblcar1.setIcon(new ImageIcon("image/car1.gif"));
		lblcar2 = new JLabel("번개");
		lblcar2.setIcon(new ImageIcon("image/car2.gif"));
		lblcar3 = new JLabel("천마");
		lblcar3.setIcon(new ImageIcon("image/car3.gif"));
		add(lblcar1);
		add(lblcar2);
		add(lblcar3);
		lblcar1.setBounds(100, 0, 100, 100);
		lblcar2.setBounds(100, 50, 100, 100);
		lblcar3.setBounds(100, 100, 100, 100);
		(new MyThread()).start();
		setVisible(true);
	}
	
}