package com.ka.mouvement;

import com.ka.character.Position;

public class MoveWest implements MovementStrategy {
    @Override
    public void move(Position position) {
        position.moveWest();
    }
}
