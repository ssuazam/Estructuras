/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structure;

/**
 *
 * @author causugamo
 */
public class LinkedLis<T extends Comparable> {

    private ChainNode head;
    private ChainNode tail;

    public LinkedLis() {
        this.head = null;
        this.tail = null;
    }

    public void pushFront(T key) {
        ChainNode node = new ChainNode(key, this.head);
        this.head = node;
        if (this.tail == null) {
            this.tail = this.head;
        }

    }

    public void popFront() {
        if (this.head == null) {
            System.out.println("ERROR: empty list");
        }
        this.head = head.getNext();
        if (this.head == null) {
            this.tail = null;
        }
    }

    public ChainNode getHead() {
        return this.head;
    }

    public void pushBack(T key) {
        ChainNode node = new ChainNode(key, null);
        if (this.head == null) {
            this.tail = node;
            this.head = this.tail;
        } else {
            this.tail.setNext(node);
            this.tail = node;
        }
    }

    public void popBack() {
        if (this.head == null) {
            System.out.println("ERROR: Empty list");
        }
        if (this.head == tail) {
            this.tail = null;
            this.head = tail;
        } else {
            ChainNode p = this.head;
            while (p.getNext().getNext() != null) {
                p = p.getNext();
            }
            p.setNext(null);
            this.tail = p;
        }
    }

    public void addAfter(ChainNode node, T key) {
        ChainNode nod = new ChainNode(key, node.getNext());
        node.setNext(nod);
        if (this.tail == node) {
            this.tail = nod;
        }
    }
}
