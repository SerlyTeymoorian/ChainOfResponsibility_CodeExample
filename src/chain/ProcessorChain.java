package chain;

import handlers.NegativeProcessor;
import handlers.PositiveProcessor;
import handlers.Processor;
import handlers.ZeroProcessor;

public class ProcessorChain {
	
	private Processor handler; 
	
	public ProcessorChain() {
		
		Processor handler1 = new NegativeProcessor(); 
		
		Processor handler2 = new ZeroProcessor(); 
		
		Processor handler3 = new PositiveProcessor();
		
		//handler pointing to NegativeProcessor 
		handler = handler1; 
		
		//setting up the chain 
		handler1.setNextChain(handler2);
		handler2.setNextChain(handler3);
	}
	
	//return the root handler 
	public Processor getProcessor() {
		return handler; 
	}
}
