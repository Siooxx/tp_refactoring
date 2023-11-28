package org.refactoring.liste;

public interface IListChainee {
    boolean add(Object o);

    boolean isEmpty();

    Object get(int i);

    Object peek();

    Object poll();

    default void secretLC() {
    }
}
