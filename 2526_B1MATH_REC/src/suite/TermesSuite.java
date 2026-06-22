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
        
    	if(n <= 0) {
    		throw new IllegalArgumentException("les termes de la suite vont de 1 à n");
    	}
    	
    	long u_n = 1;
    	for(int i = n; i >= 1; i--) {
    		
    		u_n *= i;
    	}
    	u_n *= 3;
    	
    	return u_n; // <- A modifier !
    }

    /**
     * Calcule le terme u(n) de la suite décrite ci-dessus.
     * Version récursive.
     *
     * @param n Indice du terme à calculer et à afficher
     * @return le terme à calculer et à afficher, u(n)
     */
    public static long termesSuiteRecursif(int n) {
    	
    	if(n <= 0) {
    		throw new IllegalArgumentException("les termes de la suite vont de 1 à n");
    	}
    	
    	//cas de base 
    	if(n == 1) {
    		return 3;
    	}
    	
    	return n * termesSuiteRecursif(n - 1); // <- A modifier !
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
