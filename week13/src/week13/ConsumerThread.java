package week13;

public class ConsumerThread extends Thread{
	// 소비자 작업 스레드
	private DataBox dataBox;
	
	public ConsumerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		// 소비자 스레드 작업 내용
		// data를 읽기만 가능
		for (int i=0; i<3; i++) {
			try {
				String data = dataBox.getData();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
