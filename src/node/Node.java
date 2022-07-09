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
public class Node {
    private Object o;
    private Node next;

    /**
     * Constructor por defecto del nodo
     */
    public Node() {
        this.o = null;
        this.next = null;
    }

    /**
     * Constructor con parametros del nodo
     * 
     * @param o El valor del nodo
     * @param next El nodo siguiente
     */
    public Node(Object o, Node next){
        this.o = o;
        this.next = next;
    }
    
    /**
     * Constructor con parametros del nodo
     *
     * @param o Es el objeto del nodo
     */
    public Node(Object o) {
        this.o = o;
        this.next = null;
    }
    
    /**
     * Metodo que obtiene el siguiente nodo
     *
     * @return El siguiente nodo
     */
    public Node getNext() {
       return this.next;
    }
    
    /**
     * Metodo que modifica el siguiente nodo
     *
     * @param next El nodo por el cual se cambiara el actual
     */
    public void setNext(Node next) {
        this.next = next;
    }
    
    /**
     * Metodo que obtiene el valor del nodo
     *
     * @return this.next El siguiente nodo
     */
    public Object getObject() {
       return this.o;
    }
    
    /**
     * Metodo que modifica el siguiente nodo
     *
     * @param o El valor por el cual se cambiara el actual
     */
    public void setObject(Object o) {
        this.o = o;
    }
}
