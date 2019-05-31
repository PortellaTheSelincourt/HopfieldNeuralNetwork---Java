package com.portella.hopfield;

public class App {

	public static void main(String[] args) {
		
		HopfieldNetwork hopfieldNetwork = new HopfieldNetwork(4);
		hopfieldNetwork.train(new double[]{1,0,1,0});	//Memorise pattern
		hopfieldNetwork.train(new double[]{1,1,1,1});	//Memorise pattern
		
		hopfieldNetwork.recall(new double[]{1,0,1,1}); //input pattern
		
	}
}
