package numeration;

/**
 * Nombres en chiffres romains.
 * 
 */

public class ChiffresRomains {
	/**
	 * Détermine la valeur décimale d'un nombre exprimé en chiffres romains. 
	 * Version ITERATIVE.
	 * 
	 * @param nombre Nombre exprimé en chiffres romains.
	 * @return Valeur décimale du nombre.
	 */
	public static int chiffresRomainsVersDecimalIteratif(String nombre) {
		
		// TODO
		return 0;  // <- A modifier !
	}

	/**
	 * Détermine la valeur décimale d'un nombre exprimé en chiffres romains. 
	 * Version RECURSIVE.
	 * 
	 * @param nombre Nombre exprimé en chiffres romains.
	 * @return Valeur décimale du nombre.
	 */
	public static int chiffresRomainsVersDecimalRecursif(String nombre) {
		
		// TODO
		return 0;  // <- A modifier !
	}

	/**
	 * Retourne la valeur décimale d'un chiffre romain.
	 * 
	 * @param c Un chiffre romain (M, D, C, L, X, V, I)
	 * @return La valeur décimale du chiffre romain
	 */
	private static int valeurChiffre(char c) {
		
		int valeur = 0;
		
		switch (c) {
		case 'M':
			valeur = 1000;
			break;
		case 'D':
			valeur = 500;
			break;
		case 'C':
			valeur = 100;
			break;
		case 'L':
			valeur = 50;
			break;
		case 'X':
			valeur = 10;
			break;
		case 'V':
			valeur = 5;
			break;
		case 'I':
			valeur = 1;
			break;
		}
		return valeur;
	}
}
