package ThreadControl;

public class StartDeadThread extends Thread{
	//不设置初始值就是 i=0了
	private int i;
	
	public void run(){
		for(;i<100 ; i++){
			//在Thread类中，getName就能获取当前线程的线程名
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
		//打开已经处于死亡状态的线程看看效果
		startDeadThread.start();
		System.out.println(startDeadThread.isAlive());
		
	}

}
