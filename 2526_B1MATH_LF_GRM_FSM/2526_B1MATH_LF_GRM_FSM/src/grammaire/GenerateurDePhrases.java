package grammaire;



/**
 * Génère une phrase complète respectant les règles suivantes de la grammaire :
 * 
 * P = { <phrase> -> <sujet> <verbe> | <sujet> <verbe> <complément>
 *       <sujet> -> <sujet> <qualificatif> | <sujet> qui <verbe> <complément> |
 *                  Le chat | Le chien | Le lion | Une gazelle | Un singe
 *       <prénom> -> <prénom> - <prénom> | Alberte | Isidore | Suzette | Joséphine | Marcel   
 *       <qualificatif> -> rose | à pois | grimaçant | hirsute    
 *       <verbe> -> <verbe> <adverbe> | court | mange | bondit | sautille | dort
 *       <adverbe> -> vite | lentement | joyeusement | bruyamment
 *       <complément> -> <complément> de <prénom>
 *                       dans le jardin | dans le bois | sur le divan | dans la savane | sous le lit
 *     }
 * 
 * NB : l'axiome est <phrase>
 * 
 * Affiche toutes les dérivations. 
 * Un nombre maximum de dérivations est fixé.
 */
public class GenerateurDePhrases {
	
	private static int NB_DERIVATIONS_MAX = 5;
	
	// Règles de production pour la phrase
	private static String[] PHRASE = { 
			"<sujet> <verbe>", 
			"<sujet> <verbe> <complément>"};
	
	// Règles de production pour le sujet 
	private static String[] SUJET = { 
			"<sujet> <qualificatif>",
			"<sujet> qui <verbe> <complément>", 
			"<prénom>",
			"Le chat", "Le chien", "Le lion", "Une gazelle", "Un singe" };
	
	// Règles de production pour le prénom 
		private static String[] PRENOM = { 
				"<prénom> - <prénom>",
				"Alberte", "Isidore", "Suzette", "Joséphine", "Marcel" };
	
	// Règles de production pour le qualificatif
	private static String[] QUALIFICATIF = { "rose", "à pois", "grimaçant", "hirsute" };
		
	// Règles de production pour le verbe  
	private static String[] VERBE = { 
			"<verbe> <adverbe>",
			"court", "mange", "bondit", "sautille", "dort" };
	
	// Règles de production pour l'adverbe
	private static String[] ADVERBE = { "vite", "lentement", "joyeusement", "bruyamment" };
	
	// Règles de production pour le complément 
	private static String[] COMPLEMENT = { 
			"<complément> de <prénom>",
			"dans le jardin", "dans le bois", "sur le divan", "dans la savane", "sous le lit" };

	
	/**
	 * Génère une phrase complète et affiche la dérivation complète
	 *  
     * @return la phrase générée.
	 */
    public static String genererPhrase() {
    	
    	// Commencer avec l'axiome !!!
        String axiome = "<phrase>";
        System.out.println("Dérivation initiale : " + axiome);  
        
        // Initialiser le compteur de dérivations
        int compteur = 0;
        
	    return deriver(axiome, axiome, compteur);
    }

    /**
	 * Dérive le symbole fourni en argument 
	 * (le membre de gauche des productions de la grammaire est un symbole unique)
	 * en choissisant aléatoirement une production convenable,
	 * incrémente le compteur de dérivations et 
	 * renvoie la phrase modifiée (substitution selon la règle sélectionnée). 
	 * 
	 * @param phrase  La phrase dans laquelle la substitution doit être réalisée
	 * @param symbole  Le symbole qui doit être substitué
	 * @param compteur  Le compteur de dérivations
     * @return la phrase modifiée.
	 */
    private static String deriver(String phrase, String symbole, int compteur) {
    	
    	// TODO
        
	    return "";
    }
    
    
    
    /**
	 * Programme principal
	 */
    // Générer et afficher 10 phrases aléatoires    
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            String phrase = genererPhrase();
            System.out.println("===> Phrase complète : " + phrase);
            System.out.println();
        }
    }
}



