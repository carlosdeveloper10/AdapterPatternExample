package edu.cmsoft.adapterexample;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Connecting the standar plug.
		IConnectable sp = new StandarPlug();
		System.out.println(sp.connectToStandarLeftInput());
		System.out.println(sp.connectToStandarRightInput());
		
		//Connecting the adapter plug.
		IConnectable cp = new PlugAdapter(); 
		System.out.println(cp.connectToStandarLeftInput());
		System.out.println(cp.connectToStandarRightInput());

	}

}
