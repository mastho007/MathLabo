package suite;

/**
 * Calcul du nième terme de la suite définie par :
 * 
 * 	u(1) = 3  et  u(n) = n * u(n-1)
 * 
 */

public class TermesSuite {
    
    /**
     * Calcule le terme u(n) de la suite décrite ci-dessus.
     * Version itérative.
     *
     * @param n Indice du terme à calculer 
     * @return  le terme à calculer u(n)
     */
    public static long termesSuiteIteratif(int n) {
        
    	// TODO
    	return 0L; // <- A modifier !
    }

    /**
     * Calcule le terme u(n) de la suite décrite ci-dessus.
     * Version récursive.
     *
     * @param n Indice du terme à calculer et à afficher
     * @return le terme à calculer et à afficher, u(n)
     */
    public static long termesSuiteRecursif(int n) {
    	
    	// TODO
    	return 0L; // <- A modifier !
    }
 
    
    public static void main(String[] args) {
    	
		System.out.println("--- suiteIteratif --- ");
		for(int i = 1; i <= 20; i++) {
			System.out.printf("terme %2d : %d\n", i, termesSuiteIteratif(i));
		}
		System.out.println();
		
		System.out.println("--- suiteRecursif --- ");		
		for(int i = 1; i <= 20; i++) {
			System.out.printf("terme %2d : %d\n", i, termesSuiteRecursif(i));				
		}
    }
}
