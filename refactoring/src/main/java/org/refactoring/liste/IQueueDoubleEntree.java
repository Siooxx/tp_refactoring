package org.refactoring.liste;

public interface IQueueDoubleEntree {
    boolean add(Object o);

    boolean isEmpty();

    Object peek();

    Object poll();

    default void secretQDE() {
    }
}
