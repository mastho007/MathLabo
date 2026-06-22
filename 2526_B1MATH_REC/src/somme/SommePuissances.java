package somme;

/**
 * Somme des premières puissances d'un nombre réel x :
 * 
 * x^0 + x^1 + x^2 + ... + x^n
 * 
 */

public class SommePuissances {

	/**
	 * Somme des N+1 premières puissances d'un nombre réel. Version explicite
	 * (utilisant la formule).
	 * 
	 * @param x Un nombre réel différent de 1
	 * @param n Un nombre naturel
	 * @return La valeur de la somme
	 */
	public static double sommePuissances(double x, int n) {

		// La formule exige x ≠ 1 (division par zéro)
		// n doit être ≥ 0 (pas de puissance négative dans ce contexte)

		if (x == 1) {
			throw new IllegalArgumentException("pas de division par zéro");
		}
		if (n < 0) {
			throw new IllegalArgumentException("l'exposant ne peut pas être négatif");
		}

		double somme = (Math.pow(x, n + 1) - 1) / (x - 1);

		return somme; // <- A modifier !
	}

	/**
	 * Somme des N+1 premières puissances d'un nombre réel. Version itérative.
	 * 
	 * @param x Un nombre réel différent de 1
	 * @param n Un nombre naturel
	 * @return La valeur de la somme
	 */
	public static double sommePuissancesIteratif(double x, int n) {

		// La formule exige x ≠ 1 (division par zéro)
		// n doit être ≥ 0 (pas de puissance négative dans ce contexte)

		if (x == 1) {
			throw new IllegalArgumentException("pas de division par zéro");
		}
		if (n < 0) {
			throw new IllegalArgumentException("l'exposant ne peut pas être négatif");
		}

		double somme = 0;

		for (int i = 0; i <= n; i++) {

			somme += Math.pow(x, i);

		}

		return somme; // <- A modifier !
	}

	/**
	 * Somme des N+1 premières puissances d'un nombre réel. Version récursive.
	 * 
	 * @param x Un nombre réel différent de 1
	 * @param n Un nombre naturel
	 * @return La valeur de la somme
	 */
	public static double sommePuissancesRecursif(double x, int n) {

		// La formule exige x ≠ 1 (division par zéro)
		// n doit être ≥ 0 (pas de puissance négative dans ce contexte)

		if (x == 1) {
			throw new IllegalArgumentException("pas de division par zéro");
		}
		if (n < 0) {
			throw new IllegalArgumentException("l'exposant ne peut pas être négatif");
		}

		// cas de base
		if (n == 0) {

			return 1;
		}

		return Math.pow(x, n) + sommePuissancesRecursif(x, n - 1);
	}

}
