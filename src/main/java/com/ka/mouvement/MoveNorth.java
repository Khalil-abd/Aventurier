package com.ka.mouvement;

import com.ka.character.Position;

public class MoveNorth implements MovementStrategy {
    @Override
    public void move(Position position) {
        position.moveNorth();
    }
}
