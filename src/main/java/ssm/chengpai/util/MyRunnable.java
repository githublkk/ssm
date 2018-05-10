package ssm.chengpai.util;

public class MyRunnable implements Runnable {

	private int ticket=10;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			
			for(int i=0;i<10;i++){  
				if(ticket>0){  
			    Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+"卖票：ticket"+ticket--);  
				}  
				}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public static void main(String[] args) {
		MyRunnable mt=new MyRunnable(); 
		MyRunnable mt1=new MyRunnable(); 
		MyRunnable mt2=new MyRunnable(); 
		new Thread(mt).start();//同一个mt，但是在Thread中就不可以，如果用同一  
		new Thread(mt).start();//个实例化对象mt，就会出现异常  
		new Thread(mt).start();  
	}

}
