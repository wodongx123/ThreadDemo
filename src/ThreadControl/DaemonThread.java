package ThreadControl;

public class DaemonThread extends Thread{
	private int i;
	
	public DaemonThread(String name){
		super(name);
	}
	
	public void run(){
		//让后台线程数到900，结果肯定是跑不到900的
		for(;i<900 ; i++){
			System.out.println(getName() + " " + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		DaemonThread daemonThread = new DaemonThread("线程1");
		daemonThread.setDaemon(true);
		daemonThread.start();
		//前台线程只数到100
		for(int i=0; i<100; i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
		}

	}
}
