package Thread;

public class ExtendsThread extends Thread {
	
	//�����ó�ʼֵ���� i=0��
	private int i;
	
	public void run(){
		for(;i<100 ; i++){
			//��Thread���У�getName���ܻ�ȡ��ǰ�̵߳��߳���
			System.out.println(getName() + " " + i);
		}
	}

	public static void main(String[] args) {
		//��ôд������java.lang.IllegalThreadStateException
		//Thread.currentThread().start();
		
		for(int i=0; i<100; i++){
			//����main�����Ǿ�̬����������ֱ��getName��Ҫ��Thread�ľ�̬������ȡthreadʵ��
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 20){
				new ExtendsThread().start();
				new ExtendsThread().start();
			}
		}

	}
}
