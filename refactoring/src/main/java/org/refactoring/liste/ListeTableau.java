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

class QueueDoubleEntree {
    public boolean add(Object o) {
        return true;
    }

    public boolean isEmpty() {
        return true;
    }

    public Object peek() {
        return null;
    }

    public Object poll() {
        return null;
    }

    private void secretQDE() {
    }
}

class QueueAvecPriorite {
    public boolean add(Object o) {
        return true;
    }

    public boolean isEmpty() {
        return true;
    }

    public Object peek() {
        return null;
    }

    public Object poll() {
        return null;
    }

    public Object comparator() {
        return null;
    }

    private void secretQAP() {
    }
}
