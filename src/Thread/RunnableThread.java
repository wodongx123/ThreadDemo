package Thread;

/**
 * ʹ��Runnable�ӿڴ����߳�
 */

public class RunnableThread implements Runnable {
	
	private int i;

	public void run() {
		// ����Runnable����Ҫ����ķ���
		for(;i<100 ; i++){
			//Runnable�����Ļ���û��getName�ˣ����Ի�����Thread�ľ�̬������ȡ����
			System.out.println(Thread.currentThread().getName()+ " " + i);
		}
	}
	
	public static void main(String[] args) {
		//��ôд������java.lang.IllegalThreadStateException
		//Thread.currentThread().start();
		
		for(int i=0; i<100; i++){
			//����main�����Ǿ�̬����������ֱ��getName��Ҫ��Thread�ľ�̬����
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 20){
				RunnableThread st = new RunnableThread();
				new Thread(st, "�߳�1").start();
				new Thread(st, "�߳�2").start();
			}
		}
	}
}
