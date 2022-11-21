package driver;

import chain.ProcessorChain;
import client.Number;

public class Driver {

	public static void main(String[] args) {
		
		ProcessorChain chain = new ProcessorChain(); 
		
		chain.getProcessor().process(new Number(0));

	}

}
