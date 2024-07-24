package com.ka.mouvement;

import com.ka.character.Position;

public class MoveEast implements MovementStrategy {
    @Override
    public void move(Position position) {
        position.moveEast();
    }
}
