/*
 * simple demo for starting threads 
 * by implementing interface Runnable.
 * 
 * Author: Martin Gwarada
 */

package demo2;

class Runner implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10; i++){
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hello " + i);
		}
	}
}

public class App2 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runner());
		t1.start();
		
		Thread t2 = new Thread(new Runner());
		t2.start();	
	}
}
