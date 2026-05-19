package validationEntier;


public class RegexEntier {

	/**
	 * Programme principal
	 */
	public static void main(String[] args) {
		
		String[] chainesTestees = {   };  // TODO  --> A compléter !!!
		
		String pattern = "     ";         // TODO  --> A compléter !!!
		
		System.out.printf( "%-18s %s\n",  "Chaine testée", "Résultat");		
		for (String test : chainesTestees) {
			System.out.printf( "%-14s ->  %s\n",  test, test.matches(pattern));
		}		
    }
}

 
