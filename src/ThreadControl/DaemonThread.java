package ThreadControl;

public class DaemonThread extends Thread{
	private int i;
	
	public DaemonThread(String name){
		super(name);
	}
	
	public void run(){
		//�ú�̨�߳�����900������϶����ܲ���900��
		for(;i<900 ; i++){
			System.out.println(getName() + " " + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		DaemonThread daemonThread = new DaemonThread("�߳�1");
		daemonThread.setDaemon(true);
		daemonThread.start();
		//ǰ̨�߳�ֻ����100
		for(int i=0; i<100; i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
		}

	}
}
