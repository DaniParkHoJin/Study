package carGame;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {
	private JLabel lblcar1; // �ڵ���
	private JLabel lblcar2; // �ڵ���
	private JLabel lblcar3; // �ڵ���

	int x1 = 100; // �ڵ����� ��� x��ǥ
	int x2 = 100; // �ڵ����� ��� x��ǥ
	int x3 = 100; // �ڵ����� ��� x��ǥ

	class MyThread extends Thread {
				
		public void run() {
			for (int i = 0; i < 120; i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//0.1�ʿ� �� ���� �ڵ����� x ��ġ�� �����Ѵ�.
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
		setSize(900, 250); //  ������ ������ ũ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		lblcar1 = new JLabel("��ǳ");
		lblcar1.setIcon(new ImageIcon("image/car1.gif"));
		lblcar2 = new JLabel("����");
		lblcar2.setIcon(new ImageIcon("image/car2.gif"));
		lblcar3 = new JLabel("õ��");
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