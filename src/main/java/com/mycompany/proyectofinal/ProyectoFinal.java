/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectofinal;

import java.util.Scanner;

public class ProyectoFinal {

    public static void main(String[] args) {

        String nombre;
        double compra1, compra2, compra3;
        double total, promedio;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nombre del cliente: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese compra 1: ");
        compra1 = sc.nextDouble();

        System.out.print("Ingrese compra 2: ");
        compra2 = sc.nextDouble();

        System.out.print("Ingrese compra 3: ");
        compra3 = sc.nextDouble();

        total = compra1 + compra2 + compra3;
        promedio = total / 3;

        System.out.println("\n----- RESULTADOS -----");
        System.out.println("Cliente          : " + nombre);
        System.out.println("Total compras    : " + total);
        System.out.println("Promedio compras : " + promedio);
        System.out.println("Número de telefono de Alonso");
    }
}

