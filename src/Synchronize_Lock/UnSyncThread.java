package Synchronize_Lock;


public class UnSyncThread implements Runnable{
	Num num;
	
	public UnSyncThread(Num num){
		this.num = num;
	}

	public void run() {
		while (num.getI() < 100) {
			System.out.println(Thread.currentThread().getName()+ " " + num.getI());
			num.add();
		}
	}
	
	public static void main(String[] args) {
		Num num = new Num(0);
		
		UnSyncThread st = new UnSyncThread(num);
		new Thread(st, "线程1").start();
		new Thread(st, "线程2").start();
		
	}
}
