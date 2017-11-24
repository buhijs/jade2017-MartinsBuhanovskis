package observer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FaultGenerator generator = new FaultGenerator();

        FaultObserver logOberver = new FaultLogger(generator);
        generator.faulted(1);

        //FaultObserver emailObserver = new FaultEmail(generator);
        //generator.faulted(4);
	}

}
