/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package node;

/**
 * Esta es la clase nodo en java
 * 
 * @author Rodrigo Oliveira - 29.655.609
 */
public class Node<T> {
    private T value;
    private Node<T> next;

    /**
     * Constructor por defecto del nodo
     */
    public Node() {
        this.value = null;
        this.next = null;
    }

    /**
     * Constructor con parametros del nodo
     * 
     * @param v El valor del nodo
     * @param next El nodo siguiente
     */
    public Node(T o, Node<T> next){
        this.value = o;
        this.next = next;
    }
    
    /**
     * Constructor con parametros del nodo
     *
     * @param v Es el objeto del nodo
     */
    public Node(T v) {
        this.value = v;
        this.next = null;
    }
    
    /**
     * Metodo que obtiene el siguiente nodo
     *
     * @return El siguiente nodo
     */
    public Node<T> getNext() {
       return this.next;
    }
    
    /**
     * Metodo que modifica el siguiente nodo
     *
     * @param next El nodo por el cual se cambiara el actual
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }
    
    /**
     * Metodo que obtiene el valor del nodo
     *
     * @return El siguiente nodo
     */
    public T getValue() {
       return this.value;
    }
    
    /**
     * Metodo que modifica el siguiente nodo
     *
     * @param v El valor por el cual se cambiara el actual
     */
    public void setObject(T v) {
        this.value = v;
    }
}
