package string;

/**
 * Modification de la casse d'une chaîne de caractères.
 * 
 */

public class Casse {
	/**
	 * Convertit un caractère en majuscule.
	 * 
	 * @param c un caractère
	 * @return le caractère en majuscule
	 */
	private static char majuscule(char c) {

		// on vérif si le charactère est n'est pas déja entre 'A' et 'Z'
		if (c >= 'A' && c <= 'Z') {
			return c;
		}

		// si c'est une minuscule on tranforme en fesant -32 sur le charactère
		else if (c >= 'a' && c <= 'z') {
			return (char) (c - 32);
		}else {
			return c;
		}
	}

	/**
	 * Convertit une chaîne de caractères en majuscules. Version ITERATIVE
	 * 
	 * @param txt une chaîne de caractères
	 * @return la chaîne de caractères en majuscules
	 */
	public static String majusculeIteratif(String txt) {

		StringBuilder motMaj = new StringBuilder();

		for (int i = 0; i < txt.length(); i++) {

			char lettre = txt.charAt(i);

			motMaj.append(majuscule(lettre));

		}

		return motMaj.toString();
	}

	/**
	 * Convertit une chaîne de caractères en majuscules. Version RECURSIVE
	 * 
	 * @param txt une chaîne de caractères
	 * @return la chaîne de caractères en majuscules
	 */
	public static String majusculeRecursif(String txt) {

		if (txt.isEmpty()) {
			return "";
		}

		char lettreMaj = majuscule(txt.charAt(0));

		return lettreMaj + majusculeRecursif(txt.substring(1));
	}

	/**
	 * Convertit un caractère en minuscule.
	 * 
	 * @param c un caractère
	 * @return le caractère en minuscule
	 */
	private static char minuscule(char c) {

		// on vérif si le charactère est n'est pas déja entre 'A' et 'Z'
		if (c >= 'a' && c <= 'z') {
			return c;
		}

		// si c'est une minuscule on tranforme en fesant -32 sur le charactère
		else if (c >= 'A' && c <= 'Z') {
			return (char) (c + 32);
		}else {
			return c;
		}

	
	}

	/**
	 * Convertit une chaîne de caractères en minuscules. Version ITERATIVE
	 * 
	 * @param txt une chaîne de caractères
	 * @return la chaîne de caractères en minuscules
	 */
	public static String minusculeIteratif(String txt) {

		StringBuilder motMaj = new StringBuilder();

		for (int i = 0; i < txt.length(); i++) {

			char lettre = txt.charAt(i);

			motMaj.append(minuscule(lettre));

		}

		return motMaj.toString();
	}

	/**
	 * Convertit une chaîne de caractères en minuscules. Version RECURSIVE
	 * 
	 * @param txt une chaîne de caractères
	 * @return la chaîne de caractères en minuscules
	 */
	public static String minusculeRecursif(String txt) {

		if (txt.isEmpty()) {
			return "";
		}

		char lettreMin = minuscule(txt.charAt(0));

		return lettreMin + minusculeRecursif(txt.substring(1));
	}
}
