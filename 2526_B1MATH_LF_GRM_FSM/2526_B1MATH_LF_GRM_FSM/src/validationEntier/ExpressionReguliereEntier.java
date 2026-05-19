package validationEntier;


public class ExpressionReguliereEntier {

	/**
	 * Représente les états d'un automate fini déterministe (DFA) 
	 * utilisé pour reconnaître les entiers valides.
	 */
	enum Etat {
		q0,          // État initial : aucun caractère n'a encore été lu.
		qSigne,      // Un signe ({@code +} ou {@code -}) a été lu en première position.
		qNombre,     // Au moins un chiffre a été lu. C'est le seul état d'acceptation !!!!!
		qPoubelle    // Un caractère invalide a été rencontré --> Tout caractère suivant sera ignoré.
	}	
	
	/**
	 * Vérifie si une chaîne de caractères représente un entier valide.<br>
	 * Un entier valide est défini comme une chaîne composée :
	 *  d'un signe optionnel ({@code +} ou {@code -}),
	 *  suivi d'au moins un chiffre ({@code 0-9}).
	 * 
	 * @param chaine la chaine de caractères à analyser
	 * @return {@code true} si {@code chaine} représente un entier valide,
	 *         {@code false} sinon
	 */
	public static boolean estUnEntier(String chaine) {
		
		// TODO 
		
		return false;  // <- A modifier !
	}
	
	
	/**
	 * Programme principal
	 */
	public static void main(String[] args) {
		
		String[] chainesTestees = {   };  // TODO  --> A compléter !!!
		
		System.out.printf( "%-18s %s\n",  "Chaine testée", "Résultat");		
		for (String test : chainesTestees) {
			System.out.printf( "%-14s ->  %s\n",  test, estUnEntier(test));
		}		
    }

}
