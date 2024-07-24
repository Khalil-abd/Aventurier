package com.ka;

public class Aventurier {
    private Position position;

    public Aventurier(Position position) {
        this.position = position;
    }

    public void seDeplcaer(char direction, Carte carte) {
        Position newPosition = this.position.clone();
        switch (direction) {
            case 'S':
                newPosition.moveDown();
                break;
            case 'N':
                newPosition.moveUp();
                break;
            case 'E':
                newPosition.moveRight();
                break;
            case 'O':
                newPosition.moveLeft();
                break;
        }
        if (carte.estPassable(newPosition.getX(), newPosition.getY()))
            this.position = newPosition;
    }

    public Position getPosition() {
        return position;
    }
}
