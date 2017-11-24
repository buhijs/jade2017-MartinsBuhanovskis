package observer;

import java.util.ArrayList;

public class FaultGenerator {
	 private Fault obj_;
	    private ArrayList<FaultObserver> observers_ = new ArrayList();

	    public FaultGenerator() {
	        
	    }
	    
	    public void faulted(int code) {
	        obj_ = new Fault(code);
	        
	        notifyAllObservers();
	    }
	    
	    protected void notifyAllObservers() {
	        for (FaultObserver faultObserver : observers_ ){
	            faultObserver.newFault(obj_, "We got Problems!");
	        }
	    }
	    
	    public void AddObservers(FaultObserver observer) {
	        observers_.add(observer);
	    }
	    
	    public void removeObserver(FaultObserver observer) {
	        observers_.remove(observer);
	    }
}
