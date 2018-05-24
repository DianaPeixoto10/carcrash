package org.academiadecodigo.carcrash.field;

import org.academiadecodigo.carcrash.cars.Car;

public class Position {


    int col;
    int row;

    public Position(int col, int row) {
        this.col = col;
        this.row = col;
    }

    public Car moveRight() {
        if (col == Field.getWidth() - 1) {
            return null;
        }
        col = col + 1;
        return null;
    }

    public Car moveLeft() {
        if (col == 0) {
            return null;
        }
        col = col - 1;
        return null;
    }

    public Car Up() {
        if (row == 0) {
            return null;
        }
        row = row - 1;
        return null;
    }

    public Car Down() {
        if (row == Field.getHeight() - 1) {
            return null;
        }
        row = row + 1;

        return null;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
}

