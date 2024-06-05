package threadExam;

public class WorkThread extends Thread {
	// 필드
	private boolean work = true;

	public WorkThread(String name) {
		setName(name);

	}
	

	public boolean isWork() {
		return work;
	}



	public void setWork(boolean work) {
		this.work = work;
	}



	@Override
	public void run() {
		while (true) {
			if (work) {
				System.out.println(getName()+": 작업처리");
			} else {
				Thread.yield();
			}
		}
		
	}
}
