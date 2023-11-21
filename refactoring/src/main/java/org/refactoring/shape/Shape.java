package org.refactoring.shape;

import java.awt.*;

public class Shape
{
    private Point pivot;

    public Shape() {
        pivot = new Point(1,2);
    }
    public void LogDrawing(Logger logger)
    {
        String msg = String.format("Shape is drawn at %d,  %d", pivot.x, pivot.y);
        logger.Log(msg);
    }

    public Point getPivot() {
        return pivot;
    }

    public void setPivot(Point pivot) {
        this.pivot = pivot;
    }
}
