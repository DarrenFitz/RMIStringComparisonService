package ie.gmit.sw;

import java.rmi.RemoteException;

public class Runner {

	//Runner 
	//Only for Testing Purposes
	public static void main(String[] args) throws RemoteException {
		//local Testing
		StringService ss = new StringServiceImpl();
		ss.compare("hello", "Helli", "Damerau-Levenshtein Distance");
		ss.compare("hello", "Hello", "Hamming Distance");
		ss.compare("hello", "Hello World", "Levenshtein Distance");
		
		
		
	}//end main

}//end Runner
