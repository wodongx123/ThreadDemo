package ThreadConnection;


public class WaitNotifyThread implements Runnable{
	Num num;
	
	public WaitNotifyThread(Num num){
		this.num = num;
	}

	public void run() {
		while (num.getI() < 100) {
			synchronized (num) {
				System.out.println(Thread.currentThread().getName()+ " " + num.getI());
				num.add();
				
				num.notify();
				try {
					num.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		Num num = new Num(0);
		
		WaitNotifyThread st = new WaitNotifyThread(num);
		new Thread(st, "线程1").start();
		new Thread(st, "线程2").start();
		
	}
}
