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
		Matrix masqueNoire = mPlage.and(mMasqueMonaLisa);
		Utils.displayMatrix(masqueNoire, "Plage + Negga");

		// 2. Détourage de Mona Lisa
		Matrix masqueinverse = mMasqueMonaLisa.not();
		
		Matrix jocondeEtMasqueInverse = mMonaLisa.and(masqueinverse);
				
		Utils.displayMatrix(jocondeEtMasqueInverse, "joconde + masque");
		

		// 3. Incrustation de Mona Lisa sur la plage
		Matrix JocondePlage = masqueNoire.or(jocondeEtMasqueInverse);
		
		Utils.displayMatrix(JocondePlage, "joconde + plage");
		
		/*
		 * Inscrutation des lunettes
		 */
		System.out.println("Incrustation des lunettes roses...");

		//On créé un grand masque noir 
		Matrix grandMasqueNoir = masqueNoire.and(0);
		Utils.displayMatrix(grandMasqueNoir, "Grand masque noir.");
		
		Matrix lunetteBlanche = grandMasqueNoir.insertIntoThis(65, 205, mLunettes.flipVertical().transpose().not());
		
		Utils.displayMatrix(lunetteBlanche, "Grand masque noir + lunette.");
		
		//on affiche joconde+plage+lunetteNoire
		Matrix JocondePlusLunetteNoire = JocondePlage.add(lunetteBlanche);

		Utils.displayMatrix(JocondePlusLunetteNoire, "Grand masque noir + lunette.");

		//on affiche masqueNoir + lunetteRose
		
		Matrix lunetteRose = lunetteBlanche.and(0xFF00FF);
		
		Utils.displayMatrix(lunetteRose, "Lunette Rose.");

		//on affiche joconde+plage+lunetteRose
		Matrix imageFinale = JocondePlusLunetteNoire.or(lunetteRose);
		
		Utils.displayMatrix(imageFinale, "ImageFinale.");

		
		
		
		// *Colorez le masque d’incrustation en rose (rose = 0xFF00FF) et incrustez-le pour obtenir l’image finale
		
		/*
		 * 
		 * EXERCICE OPTIONNEL : lunettes en dégradé de rose
		 */
		System.out.println("Incrustation des lunettes en dégradé de roses...");

		
	}
	
	
	
	
	
	
	
	
	
}