package ThreadControl;


public class JoinThread extends Thread{
	private int i;
	
	//Ū�����캯��������֪���߳��ĸ����ĸ�
	public JoinThread(String name){
		super(name);
	}
	
	public void run(){
		for(;i<100 ; i++){
			System.out.println(getName() + " " + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		JoinThread joinThread = new JoinThread("�߳�1");
		joinThread.start();
		for(int i=0; i<100; i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 20){
				//���̵߳������߳�1��join������
				//���̱߳�����߳�1ִ����֮����ܼ���
				joinThread.join();
			}
		}

	}

}
