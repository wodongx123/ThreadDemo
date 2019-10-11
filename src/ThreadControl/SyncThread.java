package ThreadControl;


public class SyncThread implements Runnable{
	private int i;
	
	public SyncThread(int i){
		this.i = i;
	}

	public void run() {
//		synchronized (this) {
//			while (i < 100) {
//				System.out.println(Thread.currentThread().getName()+ " " + i);
//				i++;
//			}
//		}
		count();
	}
	
	public synchronized void count(){
		while (i < 100) {
			System.out.println(Thread.currentThread().getName()+ " " + i);
			i++;
		}
	}
	
	public static void main(String[] args) {
		int i = 0;
		
		SyncThread st = new SyncThread(i);
		new Thread(st, "线程1").start();
		new Thread(st, "线程2").start();
		
	}
}
