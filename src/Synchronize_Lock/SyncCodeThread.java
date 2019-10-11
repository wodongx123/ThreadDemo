package Synchronize_Lock;


public class SyncCodeThread implements Runnable{
	Num num;
	
	public SyncCodeThread(Num num){
		this.num = num;
	}

	public void run() {
		while (num.getI() < 100) {
			//synchronized(obj){} �Ὣobj��Ϊͬ��������
			synchronized (num) {
				System.out.println(Thread.currentThread().getName()+ " " + num.getI());
				num.add();
			}
		}
	}
	
	public static void main(String[] args) {
		Num num = new Num(0);
		
		SyncCodeThread st = new SyncCodeThread(num);
		new Thread(st, "�߳�1").start();
		new Thread(st, "�߳�2").start();
		
	}
}
