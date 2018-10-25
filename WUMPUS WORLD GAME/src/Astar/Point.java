package Astar;

public class Point {

    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Point p) {
        return x == p.x && y == p.y;
    }
}