package com.ka;

public class Mouvement {
    private final Position initialPosition;
    private final String mouvements;

    public Mouvement(Position initialPosition, String mouvements) {
        this.initialPosition = initialPosition;
        this.mouvements = mouvements;
    }

    public Position getInitialPosition() {
        return initialPosition;
    }

    public String getMouvements() {
        return mouvements;
    }
}
