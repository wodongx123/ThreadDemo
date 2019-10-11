package ThreadControl;

public class YieldThread extends Thread{
	private int i;
	
	public YieldThread(String name){
		super(name);
	}
	
	public void run(){
		for(;i<100 ; i++){
			System.out.println(getName() + " " + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		YieldThread yieldThread = new YieldThread("线程1");
		yieldThread.start();
		for(int i=0; i<100; i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 90){
				//主线程调用yield方法，
				//主线程会放弃本次获得的CPU时间片
				Thread.yield();
			}
		}

	}
}
