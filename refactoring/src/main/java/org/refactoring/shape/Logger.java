package org.refactoring.shape;

// Défaut : La logique métier de la methode LogDrawing s'intègre mieux dans la classe Logger, qui est ici transmis en tant que paramètre de méthode.
// Opération de Refactoring Visée : "Move instance method"

public class Logger {
    public void Log(String msg) { System.out.println(msg); }
}