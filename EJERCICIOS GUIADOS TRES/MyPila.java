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
// MyPila.java
public class MyPila {
    public static void main(String[] args) {
        StackArray<String> nombres = new StackArray<>();
        nombres.push("alooo");
        nombres.push("Dwy");
        nombres.push("valee");
        System.out.println("Primer lugar: " + nombres.peek());
        System.out.println("El eliminado es: " + nombres.pop());
    }
}


