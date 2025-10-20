/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

/**
 *
 * @author Sara Lizbeth Serna Rodriguez 
 * Grupo: GTID141
 * Ejercicio de Pila 
 */


public class StackArray<T> implements IStack<T> {
    private T[] elements;
    private int top;

    public StackArray() {
        elements = (T[]) new Object[30];
        top = -1;
    }

    public StackArray(int size) {
        elements = (T[]) new Object[size];
        top = -1;
    }

    @Override
    public void push(T elemento) {
        if (top < elements.length - 1) {
            top++;
            elements[top] = elemento;
        } else {
            System.out.println("Pila llena");
        }
    }

    @Override
    public T pop() {
        if (estaVacia()) {
            System.out.println("Pila Vacía, no se puede eliminar");
            return null;
        } else {
            T elemento = elements[top];
            elements[top] = null;
            top--;
            return elemento;
        }
    }

    @Override
    public T peek() {
        if (estaVacia()) {
            System.out.println("Pila Vacía");
            return null;
        }
        return elements[top];
    }

    @Override
    public boolean estaVacia() {
        return top == -1;
    }
}
