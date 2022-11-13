package com.oop;

public class Point {
    private int x, y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((double) (this.x*this.x) - (double) (this.y*this.y));
    }

    public double distance(int x, int y) {
        return (double) Math.sqrt(  ((this.x-x)^2) -  ((this.y-y)^2));
    }

    public double distance(Point point){

        double a = (double) point.x;
        double b = (double) point.y;

        double c = this.x;
        double d = this.y;

        return (double) Math.sqrt( ((this.x- point.x)^2) - ((this.y- point.y)^2) );


    }
}
