package com.onlineinteract.lists;

/**
 * Created by Digilogue on 11/11/2016.
 */
public class SinglyLinkedList<E> {

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

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList() {
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
        return head.getElement();
    }

    public E last() {
        if (isEmpty())
            return null;
        return tail.getElement();
    }

    public void addFirst(E e) {
        head = new Node<>(e, head);
        if (size == 0)
            tail = head;
        size++;
    }

    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null);
        if (isEmpty()) {
            head = newest;
            tail = newest;
        } else {
            tail.setNext(newest);
            tail = newest;
        }
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0)
            tail = null;
        return answer;
    }

    public static void main(String[] args) {
        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.addFirst("A");
        singlyLinkedList.addFirst("B");
        singlyLinkedList.addFirst("C");
        singlyLinkedList.addFirst("D");

        Node<String> n = singlyLinkedList.head;
        System.out.println(n.getElement());
        for (int i = 0; i < singlyLinkedList.size() - 1; i++) {
            n = n.getNext();
            System.out.println(n.getElement());
        }

        singlyLinkedList.addLast("E");
        System.out.println();
        System.out.println(singlyLinkedList.tail.getElement());

        System.out.println();
        singlyLinkedList.removeFirst();

        n = singlyLinkedList.head;
        System.out.println(n.getElement());
        for (int i = 0; i < singlyLinkedList.size() - 1; i++) {
            n = n.getNext();
            System.out.println(n.getElement());
        }

        System.out.println();
        System.out.println("first: " + singlyLinkedList.first());
        System.out.println("last: " + singlyLinkedList.last());
    }

}
