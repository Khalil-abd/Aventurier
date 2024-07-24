package com.ka.mouvement;

import java.util.HashMap;
import java.util.Map;

public class GroundMovementFactory implements MovementFactory {
    private final Map<Character, MovementStrategy> strategies = new HashMap<>();

    public GroundMovementFactory() {
        initializeStrategies();
    }

    private void initializeStrategies() {
        strategies.put('N', new MoveNorth());
        strategies.put('S', new MoveSouth());
        strategies.put('E', new MoveEast());
        strategies.put('O', new MoveWest());
    }

    @Override
    public MovementStrategy getStrategy(char direction) {
        return strategies.get(direction);
    }
}
