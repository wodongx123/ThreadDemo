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
		
		YieldThread yieldThread = new YieldThread("�߳�1");
		yieldThread.start();
		for(int i=0; i<100; i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 90){
				//���̵߳���yield������
				//���̻߳�������λ�õ�CPUʱ��Ƭ
				Thread.yield();
			}
		}

	}
}
