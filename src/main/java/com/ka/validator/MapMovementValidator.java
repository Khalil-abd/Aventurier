package com.ka.validator;

import com.ka.carte.Map;

public class MapMovementValidator implements MovementValidator {

    private final Map map;

    public MapMovementValidator(Map map) {
        this.map = map;
    }

    @Override
    public boolean isPassable(int x, int y) {
        return map.estPassable(x, y);
    }
}
