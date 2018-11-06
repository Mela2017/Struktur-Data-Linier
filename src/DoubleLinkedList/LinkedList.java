/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleLinkedList;

/**
 *
 * @author ACER
 */
public class LinkedList {

    private ListNode head;
    private int size;

    //Linkedlist daftar = new LinkedList();
    public LinkedList() {
        head = new ListNode();
        head.setNext(head);
        head.setPrev(head);
    }

    public ListNode search(int key) {
        ListNode found = head;
        if (isEmpty()) {
            return null;
        }
        if (key == 1) {
            return found;
        }
        for (int i =0; i < size; i++) {
            if (i == key) {
                found = head.next;
            }
        }
        return found;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;

        }
    }

    public int getSize() {
        return size;
    }

    public ListNode addFirst(int elemen) {
        return addBefore(elemen, head.getNext());
    }

    public ListNode addLast(int elemen) {
        return addBefore(elemen, head);
    }

    public ListNode addBefore(int elemen, ListNode bantu) {
        ListNode baru = new ListNode(elemen);

        baru.setNext(bantu);
        baru.setPrev(bantu.getPrev());
        bantu.setPrev(baru);
        baru.getPrev().setNext(baru);
        size++;

        return baru;
    }

    public String toString() {
        String isi = "";
        ListNode pointer = head.getNext();
        while (pointer != head) {
            isi += (pointer.getData() + " ");
            pointer = pointer.getNext();
        }
        return isi;
    }

    public ListNode remove(ListNode Item) {
        ListNode point = Item;
        point.getPrev().setNext(point.getNext());
        point.getNext().setPrev(point.getPrev());
        size--;
        return point;
    }

    public ListNode removeFirst() {
        return remove(head.getNext());
    }

    public ListNode removeLast() {
        return remove(head.getPrev());
    }
}
