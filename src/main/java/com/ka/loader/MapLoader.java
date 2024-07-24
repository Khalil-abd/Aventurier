package com.ka.loader;

import com.ka.carte.Map;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MapLoader implements DataLoader<Map> {

    @Override
    public Map load(String filePath) throws IOException, RuntimeException {
        List<String> lignesCarte = Files.readAllLines(Paths.get(filePath));
        if(lignesCarte.isEmpty() || lignesCarte.get(0).isEmpty())
            throw new RuntimeException("Carte invalide!");
        int longueur = lignesCarte.size();
        int largeur = lignesCarte.get(0).length();
        char[][] map = new char[longueur][largeur];

        for(int i = 0; i < longueur; i++){
            map[i] = lignesCarte.get(i).toCharArray();
        }
        return new Map(map, longueur, largeur);
    }
}
