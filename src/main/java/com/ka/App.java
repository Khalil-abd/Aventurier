package com.ka;

import com.ka.character.Character;
import com.ka.carte.Map;
import com.ka.loader.DataLoader;
import com.ka.loader.MapLoader;
import com.ka.mouvement.MovementData;
import com.ka.loader.MovementLoader;
import com.ka.mouvement.MovementFactory;
import com.ka.mouvement.GroundMovementFactory;
import com.ka.validator.MapMovementValidator;
import com.ka.validator.MovementValidator;

import java.util.logging.Logger;

public class App 
{
    private static final Logger logger = Logger.getLogger("adventurer");
    public static void main( String[] args )
    {
        DataLoader<Map> carteLoader = new MapLoader();
        DataLoader<MovementData> movementLoader = new MovementLoader();
        Map map = null;
        MovementData movementData = null;

        try{
            map = carteLoader.load("carte.txt");
            movementData = movementLoader.load("mouvements.txt");
        }catch (Exception e){
            logger.warning(e.getMessage());
        }

        if(map == null || movementData == null) {
            logger.warning("Exercice invalide !");
            return;
        }

        MovementValidator validator = new MapMovementValidator(map);
        MovementFactory mouvementTerrestre = new GroundMovementFactory();
        Character character = new Character(movementData.getInitialPosition(), mouvementTerrestre, validator);

        for (char direction : movementData.getMouvements().toCharArray()){
            character.move(direction);
        }

        System.out.println("Le personnage doit se trouver en "+ character.getPosition());

    }
}
