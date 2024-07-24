package com.ka;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger = Logger.getLogger("aventurier");
    public static void main( String[] args )
    {
        Loader<Carte> carteLoader = new MapLoader();
        Loader<Mouvement> mouvementLoader = new MouvementLoader();
        Carte carte = null;
        Mouvement mouvements = null;
        try{
            carte = carteLoader.load("carte.txt");
            mouvements = mouvementLoader.load("mouvements.txt");
        }catch (Exception e){
            logger.warning(e.getMessage());
        }
        if(carte == null || mouvements == null) {
            logger.warning("Exercice invalide !");
            return;
        }
        Aventurier aventurier = new Aventurier(mouvements.getInitialPosition());
        System.out.println("mouvements : "+ mouvements.getMouvements());
        System.out.println("inital position : "+ mouvements.getInitialPosition());
        for (char direction : mouvements.getMouvements().toCharArray()){
            aventurier.seDeplcaer(direction, carte);
        }

        System.out.println("final position : "+ aventurier.getPosition());

    }
}
