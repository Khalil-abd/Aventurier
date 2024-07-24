package com.ka.character;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveNorth(){
        this.y -= 1;
    }

    public void moveSouth(){
        this.y += 1;
    }

    public void moveWest(){
        this.x -= 1;
    }

    public void moveEast(){
        this.x += 1;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public Position clone(){
        return new Position(this.x, this.y);
    }
}
