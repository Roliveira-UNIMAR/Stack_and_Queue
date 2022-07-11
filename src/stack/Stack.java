/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import node.Node;

/**
 * 
 * @author Rodrigo Oliveira - 29.655.609
 */
public class Stack<T> {
    private Node<T> top;
    private int size;

    /**
     * Constructor por defecto de la pila
     */
    public Stack() {
        top = null;
        size = 0;
    }
    
    /**
     * Metodo que retorna la longitud de la pila
     * 
     * @return La longitud de la pila 
     */
    public int getSize() {
        return size;
    }
    
    /**
     * Metodo que verifica si la pila esta vacia
     * 
     * @return true si la pila esta vacia, false si la pila no esta vacia 
     */
    public Boolean isEmpty() {
        return (top == null);
    }
    
    /**
     * Metodo que inserta en la cima un nodo
     * 
     * @param v El valor del nuevo nodo a la pila 
     */
    public void push(T v) {
        Node<T> newNode = new Node(v, top);
        top = newNode;
        size++;
    }
    
    /**
     * Metodo muestra la cima y la elimina de la pila
     *  
     * @return null si la pila esta vacia, sino el valor contenido en la cima
     */
    public T pop() {
        T aux;
        if (isEmpty()) {
            return null;
        } else {
            aux = top.getValue();
            top = top.getNext();
            size--;
            return aux;
        }
    }
    
    /**
     * Metodo muestra la cima sin elimilarla
     *
     * @return null si la pila esta vacia, el valor contenido en la cima
     */
    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return top.getValue();
        }
    }

}
