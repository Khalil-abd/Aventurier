package com.ka.mouvement;

import com.ka.character.Position;

public class MoveSouth implements MovementStrategy {
    @Override
    public void move(Position position) {
        position.moveSouth();
    }
}
