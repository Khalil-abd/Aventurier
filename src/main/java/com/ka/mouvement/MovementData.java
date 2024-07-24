package com.ka.mouvement;

import com.ka.character.Position;

public class MovementData {
    private final Position initialPosition;
    private final String mouvements;

    public MovementData(Position initialPosition, String mouvements) {
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
