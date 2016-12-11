package ie.gmit.sw;

import java.rmi.RemoteException;

//import algorithms
import ie.gmit.sw.*;

public class StringComparisonService {
	private String s;
	private String t;
	private String algo;
	private Resultator res;
	
	//Algorithms
	private DamerauLevenshtein damLev = new DamerauLevenshtein();
	private HammingDistance hamDis = new HammingDistance();
	private Levenshtein lev = new Levenshtein();

	public StringComparisonService(String s, String t, String algo, Resultator res){
		this.s = s;
		this.t = t;
		this.algo = algo;
		this.res = res;
		//Algorithm is set Depending on what algo String is given
		init();
	}
	
	private void init(){
		int distance;
		
		//Changes based on algroithm used
		switch (algo) {
			case "Damerau-Levenshtein Distance":
				distance=damLev.distance(s, t);
				
				try {
					//passes result back to resultator
					res.setResult("Distance is: "+distance);
					res.setProcessed();
				} catch (RemoteException e) {
					//Handle Error
					e.printStackTrace();
				}
				break;
				
			case "Hamming Distance":
				distance=hamDis.distance(s, t);
				try {
					//passes result back to resultator
					res.setResult("Distance is: "+distance);
					res.setProcessed();
				} catch (RemoteException e) {
					//Handle Error
					e.printStackTrace();
				}
				break;
	
			case "Levenshtein Distance":
				distance=lev.distance(s, t);
				try {
					//passes result back to resultator
					res.setResult("Distance is: "+distance);
					res.setProcessed();
				} catch (RemoteException e) {
					//This Handles Error
					e.printStackTrace();
				}
				break;
		}
	}
	
}
