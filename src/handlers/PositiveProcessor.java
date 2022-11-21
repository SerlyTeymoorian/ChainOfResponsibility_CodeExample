package handlers;

import client.Number;

public class PositiveProcessor implements Processor {
	
	private Processor chain; 

	@Override
	public void setNextChain(Processor nextChain) {
		this.chain = nextChain; 
	}

	@Override
	public void process(Number request) {
		if(request.getNumber() > 0) {
			
			System.out.println("PositiveProcessor: " + request.getNumber()); 
			
		} else {
			this.chain.process(request);
		}
		
	}


}
