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
 * 
 */

public interface IStack<T> {
    void push(T elemento);
    T pop();
    T peek();
    boolean estaVacia();
}

