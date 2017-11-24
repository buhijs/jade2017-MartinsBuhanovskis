package singleton_impl;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppTimer timer = AppTimer.getInstance();
		
		double sum=0;
		for (int i = 0; i < 1000000; i++) {
			sum=sum+Math.sqrt(i);
			if(i == 1000000/2) {
				timer.printTime();
			}
		}
		timer.printTime();
	}

}
