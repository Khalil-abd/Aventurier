package com.ka;

public class Carte {
    private final int longuer;
    private final int largeur;
    private final char[][] terrain;

    public Carte(char[][] map, int longueur, int largeur) {
        this.terrain = map;
        this.longuer = longueur;
        this.largeur = largeur;
    }

    public int getLonguer() {
        return longuer;
    }

    public int getLargeur() {
        return largeur;
    }

    public char[][] getTerrain() {
        return terrain;
    }

    public boolean estPassable(int x, int y){
        if(x < 0 || x >= largeur)
            return false;
        if(y < 0 || y >= longuer)
            return false;
        return terrain[y][x] != '#';
    }
}
