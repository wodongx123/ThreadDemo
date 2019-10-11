package Synchronize_Lock;

import java.util.concurrent.locks.ReentrantLock;


public class Num {
	private int i;
	
	//实例化一个对象锁
	private ReentrantLock lock = new ReentrantLock();
	
	public Num(int i){
		this.i = i;
	}
	
	public int getI() {
		return i;
	}
	
	public void add(){
		i++;
	}
	
//	public synchronized void add() {
//		i++;
//	}
	
//	public void add() {
//		//在执行代码块前先上锁
//		lock.lock();
//		//对需要执行的代码内容保证线程同步
//		try{
//			i++;
//		}
//		//finally保证无论如何最后都能释放锁
//		finally{
//			lock.unlock();
//		}
//	}
	

	
	public void sub() {
		if (i>0) {
			i--;
		}
	}
}
