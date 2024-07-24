package com.ka.character;

import com.ka.mouvement.MovementFactory;
import com.ka.mouvement.MovementStrategy;
import com.ka.validator.MovementValidator;

public class Character {
    private Position position;
    private final MovementFactory strategyFactory;
    private final MovementValidator validator;

    public Character(Position position, MovementFactory strategyFactory, MovementValidator validator) {
        this.position = position;
        this.strategyFactory = strategyFactory;
        this.validator = validator;
    }

    public void move(char direction) {
        MovementStrategy strategy = strategyFactory.getStrategy(direction);
        if (strategy != null) {
            Position newPosition = position.clone();
            strategy.move(newPosition);
            if (validator.isPassable(newPosition.getX(), newPosition.getY())) {
                position = newPosition;
            }
        }
    }

    public Position getPosition() {
        return position;
    }
}
