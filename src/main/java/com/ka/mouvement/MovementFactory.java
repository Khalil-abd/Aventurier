package com.ka.mouvement;

public interface MovementFactory {
    MovementStrategy getStrategy(char direction);
}
