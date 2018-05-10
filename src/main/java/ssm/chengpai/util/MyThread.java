package ssm.chengpai.util;


public class MyThread extends Thread{
	
	
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
				
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			
			System.out.println(Thread.currentThread().getName()+i+"sssss");
		}
		
	}
	
	
	public static void main(String[] args) {
		Thread my=new MyThread();
		Thread my1=new MyThread();
		Thread my2=new MyThread();
		my.start();
	
		my1.start();
		my2.start();
	}
}
