package monalisa;
import matrix.Matrix;
import matrix.Utils;

/**
 * Mona Lisa a besoin de vacances
 * 
 * @author François Schumacker
 */
public class MonaLisa {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		
		System.out.println("Mona Lisa a besoin de vacances !\n");

		/*
		 * Chargement des images...
		 */
		System.out.println("Chargement des images...");

		// Chargement de l'image de Mona Lisa
		Matrix mMonaLisa = Utils.loadImage("img/monalisa/mona_lisa.jpg");
		Utils.displayMatrix(mMonaLisa, "Mona Lisa");

		// Chargement de l'image de la plage
		Matrix mPlage = Utils.loadImage("img/monalisa/plage.jpg");
		Utils.displayMatrix(mPlage, "Plage paradisiaque");

		// Chargement du masque de Mona Lisa
		Matrix mMasqueMonaLisa = Utils.loadImage("img/monalisa/masque_mona_lisa.png");
		Utils.displayMatrix(mMasqueMonaLisa, "Masque Mona Lisa");
		
		// Chargement de la silhouette des lunettes
		Matrix mLunettes = Utils.loadImage("img/monalisa/lunettes.png");
		Utils.displayMatrix(mLunettes, "Lunettes");
		
		/*
		 * Incrustation de Mona Lisa sur la plage...
		 */
		System.out.println("Incrustation de Mona Lisa sur la plage...");

		// 1. Détourage de la zone d'incrustation

		// TODO

		// 2. Détourage de Mona Lisa

		// TODO

		// 3. Incrustation de Mona Lisa sur la plage

		// TODO
		
		/*
		 * Inscrutation des lunettes
		 */
		System.out.println("Incrustation des lunettes roses...");

		// TODO
		
		/*
		 * EXERCICE OPTIONNEL : lunettes en dégradé de rose
		 */
		System.out.println("Incrustation des lunettes en dégradé de roses...");

		// TODO - Facultatif
	}
}