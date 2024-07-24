package com.ka;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MouvementLoader implements Loader<Mouvement>{
    @Override
    public Mouvement load(String filePath) throws IOException, RuntimeException {
        List<String> lignesMouvements = Files.readAllLines(Paths.get(filePath));

        if(lignesMouvements.size() < 2)
            throw new RuntimeException("Mouvements invalids");
        if(lignesMouvements.get(0).length() < 3)
            throw new RuntimeException("Position initiale invalide");

        String position = lignesMouvements.get(0);
        String mouvements = lignesMouvements.get(1);

        int x = Character.getNumericValue(position.charAt(0));
        int y = Character.getNumericValue(position.charAt(2));

        Position positionInitial = new Position(x, y);
        return new Mouvement(positionInitial, mouvements);
    }
}
