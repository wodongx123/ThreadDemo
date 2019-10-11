package Synchronize_Lock;

public class DeadLock {
	public static String str1 = "str1";
	public static String str2 = "str2";
	
	public static void main(String[] args){
		Thread a = new Thread1(	);
		Thread b = new Thread2();
		a.start();
		b.start();
	}
}

class Thread1 extends Thread{
	
	public void run(){
		try {
			//����סstr1
			synchronized (DeadLock.str1) {
				System.out.println(getName() + "��ס��" + DeadLock.str1);
				Thread.sleep(3000); // ���㻺��ʱ�����߳�2��סstr2
				
				//����סstr2
				synchronized (DeadLock.str2) {
					System.out.println(getName() + "��ס��" + DeadLock.str2);

				}
			}
		} catch (Exception e) {
			
		}
	}
}

class Thread2 extends Thread{
	
	public void run(){
		try {
			synchronized (DeadLock.str2) {
				System.out.println(getName() + "��ס��" + DeadLock.str2);
				Thread.sleep(3000);		
				synchronized (DeadLock.str1) {
					System.out.println(getName() + "��ס��" + DeadLock.str1);

				}
			}
		} catch (Exception e) {
			
		}
	}
}