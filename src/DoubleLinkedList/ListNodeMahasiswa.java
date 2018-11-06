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
public class ListNodeMahasiswa {
        
    private int data;
    ListNodeMahasiswa next;
    private ListNode prev;

    public ListNodeMahasiswa() {
    }

    public ListNodeMahasiswa(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNodeMahasiswa getNext() {
        return next;
    }

    public void setNext(ListNodeMahasiswa next) {
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }
}