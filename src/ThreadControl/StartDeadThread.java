package ThreadControl;

public class StartDeadThread extends Thread{
	//�����ó�ʼֵ���� i=0��
	private int i;
	
	public void run(){
		for(;i<100 ; i++){
			//��Thread���У�getName���ܻ�ȡ��ǰ�̵߳��߳���
			System.out.println(getName() + " " + i);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StartDeadThread startDeadThread = new StartDeadThread();
		startDeadThread.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//���Ѿ���������״̬���߳̿���Ч��
		startDeadThread.start();
		System.out.println(startDeadThread.isAlive());
		
	}

}
