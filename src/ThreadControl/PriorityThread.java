package ThreadControl;

public class PriorityThread extends Thread{
	private int i;
	
	//Ū�����캯��������֪���߳��ĸ����ĸ�
	public PriorityThread(String name){
		super(name);
	}
	
	public void run(){
		for(;i<100 ; i++){
			System.out.println(getName() + "  �߳����ȼ�Ϊ��" + getPriority() + "  i = " + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		PriorityThread priorityThread = new PriorityThread("�߳�1");
		priorityThread.start();
		for(int i=0; i<100; i++){
			System.out.println(Thread.currentThread().getName() + "  �߳����ȼ�Ϊ��" + Thread.currentThread().getPriority() + "  i = "  + i);
			if(i == 20){
				//�߳�1����setPriority��������ø��ߵ����ȼ�
				//�󲿷�������߳�1������߳���ִ����
				priorityThread.setPriority(MAX_PRIORITY);
			}
		}
	}
}
