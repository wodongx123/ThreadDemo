package ThreadControl;

public class PriorityThread extends Thread{
	private int i;
	
	//弄个构造函数，可以知道线程哪个是哪个
	public PriorityThread(String name){
		super(name);
	}
	
	public void run(){
		for(;i<100 ; i++){
			System.out.println(getName() + "  线程优先级为：" + getPriority() + "  i = " + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		PriorityThread priorityThread = new PriorityThread("线程1");
		priorityThread.start();
		for(int i=0; i<100; i++){
			System.out.println(Thread.currentThread().getName() + "  线程优先级为：" + Thread.currentThread().getPriority() + "  i = "  + i);
			if(i == 20){
				//线程1调用setPriority方法，获得更高的优先级
				//大部分情况下线程1会比主线程先执行完
				priorityThread.setPriority(MAX_PRIORITY);
			}
		}
	}
}
