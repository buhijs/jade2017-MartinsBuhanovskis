package singleton_impl;

public class Singleton {
//	private static Thread t;
	private static Singleton instance = null;
	   protected Singleton() {
	     
	   }
	public static Singleton getInstance() {
		if(instance == null) {
	         instance = new Singleton();
		}
		return instance;
	}
	/*public static void work(){
	    if (t != null) t.interrupt();
	    t= new Thread (new Runnable(){
	            public void run(){
	                try {
	                    Thread.sleep(600);
	                } catch (InterruptedException e) {
	                    return;
	                }
	                for(int i=0; i<10000; i++){
	                    System.out.println(i);
	                }
	            }
	            });
	    t.start();
	}*/
/*	public static void main(String[] args) {
	    work();
	    for (int i =0;i<100; i++);
	    System.out.println("oooooooooooooooooooooooooooooooooooooooooo");
	    for (int i =0;i<100; i++);
	    work();
	    for (int i =0;i<500; i++);
	    System.out.println("oooooooooooooooooooooooooooooooooooooooooo");
	}*/
}
