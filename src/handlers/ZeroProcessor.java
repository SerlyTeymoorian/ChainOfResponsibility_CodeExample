package handlers;

import client.Number;

public class ZeroProcessor implements Processor {

	private Processor chain; 
	
	@Override
	public void process(Number request) {
		
		if(request.getNumber() == 0) {
			
			System.out.println("ZeroProcessor: " + request.getNumber());
			
		} else {
			this.chain.process(request);
		}
		
	}

	@Override
	public void setNextChain(Processor nextChain) {
		this.chain = nextChain; 
		
	}

}
