package handlers;

import client.Number; 

public interface Processor {
	
	public void setNextChain(Processor nextChain); 
	
	public void process(Number request); 
}
