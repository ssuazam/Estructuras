/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structure;

public class ChainNode<T extends Comparable>{

    private T data;
    private ChainNode<T> next;

    public ChainNode(T data) {
        this.data = data;
        next = null;
    }

    public ChainNode(T data, ChainNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ChainNode getNext() {
        return next;
    }

    public void setNext(ChainNode<T> next) {
        this.next = next;
    }
}
