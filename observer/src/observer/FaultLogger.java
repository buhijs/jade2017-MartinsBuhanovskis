package observer;

import java.util.logging.*;

public class FaultLogger implements FaultObserver {
    
    public FaultLogger(FaultGenerator subject) {
        subject.AddObservers(this);
    }
    
    @Override
    public void newFault(Fault fault, String msg) {
        
        System.out.println(msg + " Error code: " + fault.getType());
        
    }
    
}