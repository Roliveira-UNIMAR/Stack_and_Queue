/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import node.Node;

/**
 * Write a description of class Queue here.
 * 
 * @author Rodrigo Oliveira - 29.655.609
 */
public class Queue{
    private Node top, tail;
    private int size;

    /**
     * Constructor por defecto de la cola
     */
    public Queue() {
        top = tail = null;
        size = 0;
    }
    
    /**
     * Metodo que retorna la longitud de la cola
     * 
     * @return size la longitud de la cola 
     */
    public int getSize() {
        return size;
    }
    
    /**
     * Metodo que verifica si la cola esta vacia
     * 
     * @return true si la cola esta vacia, false si la cola no esta vacia 
     */
    public Boolean isEmpty() {
        return (top == null);
    }
    
     /**
     * Metodo retorna el frente de la cola
     * 
     * @return null si la cola esta vacia, sino el valor contenido en el frente
     */
    public Object front() {
        if (isEmpty()) {
            return null;
        } else {
            return top.getObject();
        }
    }
    
    /**
     * Metodo que inserta al final de la cola
     * 
     * @param o El nuevo nodo de la cola 
     */
    public void enqueue(Object o) {
        Node newNode = new Node(o, null);
        if (isEmpty()) {
            top = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
    }
    
     /**
     * Metodo que remueve al principio de la cola
     * 
     * @return aux El valor contenido en el frente de la cola
     */
    public Object enqueue() {
        Object aux;
        if (isEmpty()) {
            aux = null;
        } else {
            aux = top.getObject();
            top = top.getNext();
            size--;
            if (isEmpty()){
                tail = null;
            }
        }
        return aux;
    }

}