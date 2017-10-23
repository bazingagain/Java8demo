package com.leon.learnjava.part1.common;

/**
 * Created on 23/10/2017.
 *
 * @author Xiaolei-Peng
 */
public class Color {
    private Integer x;
    private Integer y;
    private Integer z;

    public Color(Integer x, Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }
}
