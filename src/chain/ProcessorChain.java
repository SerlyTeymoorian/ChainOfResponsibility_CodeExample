package chain;

import handlers.NegativeProcessor;
import handlers.PositiveProcessor;
import handlers.Processor;
import handlers.ZeroProcessor;

public class ProcessorChain {
	
	private Processor c1; 
	
	public ProcessorChain() {
		
		//handler pointing to NegativeProcessor 
		c1 = new NegativeProcessor();
		
		Processor c2 = new ZeroProcessor(); 
		
		Processor c3 = new PositiveProcessor();
		
		//setting up the chain 
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}
	
	//return the root handler 
	public Processor getProcessor() {
		return c1; 
	}
}
