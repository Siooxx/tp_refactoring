package org.refactoring.liste;

public class ListeTableau implements IList {
    @Override
    public boolean add(Object o) {
        return true;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public Object get(int i) {
        return null;
    }

    int nbLT;
}

class ListeChainee implements IListChainee {
    @Override
    public boolean add(Object o) {
        return true;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public Object get(int i) {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public Object poll() {
        return null;
    }

}

class QueueDoubleEntree implements IQueueDoubleEntree {
    @Override
    public boolean add(Object o) {
        return true;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public Object poll() {
        return null;
    }

}

class QueueAvecPriorite implements IQueueAvecPriorite {
    @Override
    public boolean add(Object o) {
        return true;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public Object poll() {
        return null;
    }

    @Override
    public Object comparator() {
        return null;
    }

}
