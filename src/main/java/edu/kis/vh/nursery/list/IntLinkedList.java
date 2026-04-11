package edu.kis.vh.nursery.list;

/**
 * Klasa reprezentująca dwukierunkową listę powiązaną przechowującą liczby całkowite.
 */
public class IntLinkedList {

    private static final int ERROR = -1;
    private Node last;
    int i; // TODO: needs refactoring - usunąć nieużywaną zmienną 'i'

    /**
     * Dodaje nowy element na koniec listy.
     * * @param i wartość całkowita, która ma zostać dodana do listy
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    /**
     * Sprawdza, czy lista jest pusta.
     * * @return true jeśli lista nie posiada żadnych elementów, w przeciwnym razie false
     */
    public boolean isEmpty() {
        return last == null;
    }
    /**
     * Sprawdza, czy lista jest pełna.
     * W obecnej implementacji lista oparta na węzłach nigdy nie jest pełna.
     * * @return zawsze zwraca false
     */
    public boolean isFull() {
        return false;
    }
    /**
     * Zwraca wartość ostatnio dodanego elementu bez jego usuwania.
     * * @return wartość elementu na wierzchołku lub -1 (ERROR) jeśli lista jest pusta
     */
    public int top() {
        if (isEmpty())
            return ERROR;
        return last.value;
    }

    /**
     * Zdejmuje i zwraca wartość ostatnio dodanego elementu z listy.
     * * @return wartość usuniętego elementu lub -1 (ERROR) jeśli lista jest pusta
     */
    public int pop() {
        if (isEmpty())
            return ERROR;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

    // Klasa przeniesiona z pliku Node.java
    private class Node {
        final int value;
        Node prev, next;

        public Node(int i) {
            value = i;
        }
    }
}