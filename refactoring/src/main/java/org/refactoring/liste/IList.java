package org.refactoring.liste;

public interface IList {
    static void staticLT() {
    }

    boolean add(Object o);

    boolean isEmpty();

    Object get(int i);

    default void secretLT() {
    }
}
