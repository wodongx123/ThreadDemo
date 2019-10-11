package Thread;

/**
 * 使用Runnable接口创建线程
 */

public class RunnableThread implements Runnable {
	
	private int i;

	public void run() {
		// 引入Runnable必须要加入的方法
		for(;i<100 ; i++){
			//Runnable方法的话就没有getName了，所以还是用Thread的静态方法获取名字
			System.out.println(Thread.currentThread().getName()+ " " + i);
		}
	}
	
	public static void main(String[] args) {
		//这么写报错了java.lang.IllegalThreadStateException
		//Thread.currentThread().start();
		
		for(int i=0; i<100; i++){
			//由于main函数是静态函数，不能直接getName，要用Thread的静态方法
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 20){
				RunnableThread st = new RunnableThread();
				new Thread(st, "线程1").start();
				new Thread(st, "线程2").start();
			}
		}
	}
}
