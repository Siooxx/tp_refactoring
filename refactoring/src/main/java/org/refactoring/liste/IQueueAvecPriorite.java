package org.refactoring.liste;

public interface IQueueAvecPriorite {
    boolean add(Object o);

    boolean isEmpty();

    Object peek();

    Object poll();

    Object comparator();

    default void secretQAP() {
    }
}
