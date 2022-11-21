package handlers;

import client.Number;

public class NegativeProcessor implements Processor {

	private Processor chain; 
	
	@Override
	public void setNextChain(Processor nextChain) {
		this.chain = nextChain; 
	}

	@Override
	public void process(Number request) {
		if(request.getNumber() < 0) {
			
			System.out.println("NegativeProcessor: " + request.getNumber());
		
		} else {
			this.chain.process(request);
		}
		
	}


}
