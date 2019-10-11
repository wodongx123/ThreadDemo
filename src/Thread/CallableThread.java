package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
 
/**
 * ʹ��Callable�ӿ��������߳�
 */
 
public class CallableThread  implements Callable<Integer>{

	//���call�����Ͳ����Runnable��run�����ˣ������׳��쳣���з���ֵ
	public Integer call() throws Exception {
		int i=0;
		for(; i<100; i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		return i;
	}
	
	public static void main(String[] args){
		//ʵ����Callable����
		CallableThread callableThread = new CallableThread();
		
		//ʹ��FutureTask����װ����
		FutureTask<Integer> task = new FutureTask<Integer>(callableThread);
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			if (i == 20) {
				//ʵ���Ͼ���������һ��Callable�߳�
				new Thread(task, "Callable�߳�").start();
			}
		}
		
		try {
			//��ȡ����ֵ��Callable�ķ���ֵ���п����׳��쳣�ģ�����Ҫtry/catch
			System.out.println("Callable����ֵ:" + task.get());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
    
}

