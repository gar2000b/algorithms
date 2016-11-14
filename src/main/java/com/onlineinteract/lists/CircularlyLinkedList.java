package com.onlineinteract.lists;

/**
 * Created by Digilogue on 11/11/2016.
 */
public class CircularlyLinkedList<E> {

    // Nested node class
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            this.element = e;
            this.next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    }

    private Node<E> tail = null;
    private int size = 0;

    public CircularlyLinkedList() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty())
            return null;
        return tail.getNext().getElement();
    }

    public E last() {
        if (isEmpty())
            return null;
        return tail.getElement();
    }

    public void rotate() {
        tail = tail.getNext();
    }

    public void addFirst(E e) {

        if (size == 0) {
            tail = new Node<>(e, null);
            tail.setNext(tail);
        } else {
            Node<E> n = new Node<>(e, tail.getNext());
            tail.setNext(n);
        }
        size++;
    }

    public void addLast(E e) {
        addFirst(e);
        tail = tail.getNext();
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        E answer = tail.getNext().getElement();
        if (tail.getNext() != tail) {
            tail.setNext(tail.getNext().getNext());
        } else {
            tail = null;
        }
        size--;
        return answer;
    }

    public static void main(String[] args) {
        CircularlyLinkedList<String> circularlyLinkedList = new CircularlyLinkedList<>();
        circularlyLinkedList.addFirst("A");
        circularlyLinkedList.addFirst("B");
        circularlyLinkedList.addFirst("C");
        circularlyLinkedList.addFirst("D");

        Node<String> n = circularlyLinkedList.tail.getNext();
        System.out.println("getNext() called: ");
        System.out.println(n.getElement());
        System.out.println("loop around remaining items in list: ");
        for (int i = 0; i < circularlyLinkedList.size() - 1; i++) {
            n = n.getNext();
            System.out.println(n.getElement());
        }
        System.out.println("loop end.");

        circularlyLinkedList.addLast("E");
        System.out.println();
        System.out.println(circularlyLinkedList.tail.getElement());

        System.out.println();
        circularlyLinkedList.removeFirst();

        n = circularlyLinkedList.tail.getNext();
        System.out.println(n.getElement());
        for (int i = 0; i < circularlyLinkedList.size() - 1; i++) {
            n = n.getNext();
            System.out.println(n.getElement());
        }

        System.out.println();
        System.out.println("first: " + circularlyLinkedList.first());
        System.out.println("last: " + circularlyLinkedList.last());
        System.out.println();

        circularlyLinkedList.rotate();

        n = circularlyLinkedList.tail.getNext();
        System.out.println(n.getElement());
        for (int i = 0; i < circularlyLinkedList.size() - 1; i++) {
            n = n.getNext();
            System.out.println(n.getElement());
        }
    }

}
