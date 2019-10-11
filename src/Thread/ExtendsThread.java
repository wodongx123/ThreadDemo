package Thread;

public class ExtendsThread extends Thread {
	
	//不设置初始值就是 i=0了
	private int i;
	
	public void run(){
		for(;i<100 ; i++){
			//在Thread类中，getName就能获取当前线程的线程名
			System.out.println(getName() + " " + i);
		}
	}

	public static void main(String[] args) {
		//这么写报错了java.lang.IllegalThreadStateException
		//Thread.currentThread().start();
		
		for(int i=0; i<100; i++){
			//由于main函数是静态函数，不能直接getName，要用Thread的静态方法获取thread实例
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 20){
				new ExtendsThread().start();
				new ExtendsThread().start();
			}
		}

	}
}
