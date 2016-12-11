package ie.gmit.sw;

public class HammingDistance {
	public int distance(String s, String t) {
		if (s.length() != t.length()) return -1;
		int count = 0;
		
		for (int i = 0; i < s.length(); ++i){
			if (s.charAt(i) != t.charAt(i)) count++;
		}
		return  count;
	}
	
    public static void main(String[] args) {
    	HammingDistance algorithms = new HammingDistance();
    	System.out.println(algorithms.distance("Distributed Systems", "Disturbed Systems"));
    	System.out.println(algorithms.distance("Distributed Systems", "Distressed Sausages"));
    	System.out.println(algorithms.distance("Distributed Systems", "Distasteful Sisters"));
    	System.out.println(algorithms.distance("Distributed Systems", "Distended Cisterns"));
    	System.out.println(algorithms.distance("Distributed Systems", "Distempered Sisyphus"));
    	System.out.println(algorithms.distance("Distributed Systems", "Distilled Cistercians"));
	}	
}
