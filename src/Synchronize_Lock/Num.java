package Synchronize_Lock;

import java.util.concurrent.locks.ReentrantLock;


public class Num {
	private int i;
	
	//ʵ����һ��������
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
//		//��ִ�д����ǰ������
//		lock.lock();
//		//����Ҫִ�еĴ������ݱ�֤�߳�ͬ��
//		try{
//			i++;
//		}
//		//finally��֤�������������ͷ���
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
