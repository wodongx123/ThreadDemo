package ThreadConnection;

import java.util.concurrent.locks.ReentrantLock;


public class Num {
	private int i;
	
	public Num(int i){
		this.i = i;
	}
	
	public int getI() {
		return i;
	}
	
	public void add(){
		i++;
	}
	
	public void sub() {
		if (i>0) {
			i--;
		}
	}
}
