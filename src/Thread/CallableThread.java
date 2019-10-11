package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
 
/**
 * 使用Callable接口来创建线程
 */
 
public class CallableThread  implements Callable<Integer>{

	//这个call方法就差不多是Runnable的run方法了，允许抛出异常，有返回值
	public Integer call() throws Exception {
		int i=0;
		for(; i<100; i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		return i;
	}
	
	public static void main(String[] args){
		//实例化Callable对象
		CallableThread callableThread = new CallableThread();
		
		//使用FutureTask来包装对象
		FutureTask<Integer> task = new FutureTask<Integer>(callableThread);
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			if (i == 20) {
				//实际上就是启动了一个Callable线程
				new Thread(task, "Callable线程").start();
			}
		}
		
		try {
			//获取返回值，Callable的返回值是有可能抛出异常的，所以要try/catch
			System.out.println("Callable返回值:" + task.get());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
    
}

