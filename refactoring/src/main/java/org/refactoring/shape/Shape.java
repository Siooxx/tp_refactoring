package org.refactoring.shape;

import java.awt.*;

// Défaut : La logique métier de la methode LogDrawing s'intègre mieux dans la classe Logger, qui est ici transmis en tant que paramètre de méthode.
// Opération de Refactoring Visée : "Move instance method"

public class Shape {
    private Point pivot;

    public Shape() { pivot = new Point(1,2); }

    public Point getPivot() { return pivot; }

    public void setPivot(Point pivot) { this.pivot = pivot; }
}