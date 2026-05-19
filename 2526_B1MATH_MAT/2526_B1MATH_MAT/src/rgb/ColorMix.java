package rgb;

import matrix.Matrix;
import matrix.Utils;

/**
 * Mélange de couleurs et dégradés
 * 
 * @author François Schumacker
 */
public class ColorMix {
	/*
	 * Matrices de départ
	 */
	static final int TAILLE = 256;
	static final Matrix mTriangulaireInf = new Matrix(TAILLE, 1, 1, Matrix.LOWER_TRIANGLE);
	static final Matrix mUns = new Matrix(TAILLE, TAILLE, 1);

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		
		System.out.println("Mix de couleurs...\n");
		
		Matrix mNuancesBleu = nuancesDeBleu();
		Utils.displayMatrix(mNuancesBleu, "Dégradé bleu");
		
		Matrix mNuancesVert = nuancesDeVert();
		Utils.displayMatrix(mNuancesVert, "Dégradé vert");

		Matrix mMixBleuVert = nuancesBleuVert(mNuancesBleu, mNuancesVert);
		Utils.displayMatrix(mMixBleuVert, "Dégradé bleu/vert");

		Matrix mMixDeCouleurs = mixDeCouleurs(mMixBleuVert);
		Utils.displayMatrix(mMixDeCouleurs, "Mix de couleurs");

	}

	/**
	 * NUANCES DE BLEU
	 * 
	 * @return une matrice qui représente un dégradé de bleu
	 */
	private static Matrix nuancesDeBleu() {
		// Création de la matrice de nuances de BLEU
		// Il s'agit d'une matrice carrée avec les valeurs 0 à 255 en lignes
		//    0 0 0 ... 0
		//    1 1 1 ... 1
		//    2 2 2 ... 2
		//    ...
		//    255 255 255 ... 255

		// TODO
		return null; // <- à modifier !!!
	}
	
	/**
	 * NUANCES DE VERT
	 * 
	 * @return une matrice qui représente un dégradé de vert
	 */
	private static Matrix nuancesDeVert() {
		// TODO
		return null; // <- à modifier !!!
	}
	
	/**
	 * MIX NUANCES DE BLEU ET DE VERT
	 * 
	 * @return une matrice qui représente un mélange des dégradés de bleu et de vert
	 */
    private static Matrix nuancesBleuVert(Matrix mBleu, Matrix mVert) {
		// TODO
		return null; // <- à modifier !!!
    }
    
	/*
	 * EXERCICE FACULTATIF
	 */
    
	/**
	 * MIX DE COULEURS
	 * 
	 * @return une matrice qui représente un mix des couleurs R/V/B
	 */
    private static Matrix mixDeCouleurs(Matrix mBleuVert) {
		// TODO - Facultatif
		return null; // <- à modifier !!!
	}

}