package singleton_impl;

public class AppTimer {
	
	static {
			timer = new AppTimer();
	}
	
	private static AppTimer timer;
	private int time=0;
	
	private AppTimer() {
		// counting time
		Thread runTime = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(time <10) {
					try {
					Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					time++;
				}
				
			}
		});
		runTime.start();
	}
	
	public static AppTimer getInstance() {
		
		//if(timer == null) {
		//	timer = new App();
		//}
		
		
		
		// todo code
		return timer;
	}
	
	public void printTime() {
		System.out.println("Time passed (s): "+time);
		System.out.println("***Time passed (s): " + System.currentTimeMillis());
	}
	
	

}
