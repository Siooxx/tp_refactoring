package org.refactoring.shape;

public class Logger {
    public void Log(String msg) { System.out.println(msg); }

    public void LogDrawing(Shape shape) {
        String msg = String.format("Shape is drawn at %d,  %d", shape.getPivot().x, shape.getPivot().y);
        Log(msg);
    }
}