package org.refactoring.liste;

import org.refactoring.liste.general.IGeneralCollection;
import org.refactoring.liste.general.IQueueBehavior;
import org.refactoring.liste.general.IRandomAccess;

public class ListeTableau implements IGeneralCollection, IRandomAccess {
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

    public void secretLT() {
    }

    public static void staticLT() {
    }

    int nbLT;
}

class ListeChainee implements IRandomAccess, IQueueBehavior {
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

    private void secretLC() {
    }

}

class QueueDoubleEntree implements IQueueBehavior {
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

    private void secretQDE() {}

}

class QueueAvecPriorite implements IQueueBehavior {
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

    public Object comparator() {
        return null;
    }

    private void secretQAP() {}

}
