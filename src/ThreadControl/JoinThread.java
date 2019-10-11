package ThreadControl;


public class JoinThread extends Thread{
	private int i;
	
	//弄个构造函数，可以知道线程哪个是哪个
	public JoinThread(String name){
		super(name);
	}
	
	public void run(){
		for(;i<100 ; i++){
			System.out.println(getName() + " " + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		JoinThread joinThread = new JoinThread("线程1");
		joinThread.start();
		for(int i=0; i<100; i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 20){
				//主线程调用了线程1的join方法，
				//主线程必须等线程1执行完之后才能继续
				joinThread.join();
			}
		}

	}

}
