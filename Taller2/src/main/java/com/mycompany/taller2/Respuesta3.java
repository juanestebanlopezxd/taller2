/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller2;

import java.util.Scanner;

/**
 *
 * @author JUAN ESTEBAN
 */
public class Respuesta3 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        float costoFijo;
        float porcentajeDeUtilidad;
        float iva;
        String nombreArticulo;
        System.out.println("***CALCULADORA DE PRECIO DE VENTA***");
        System.out.println("Nombre del Articulo ");
        nombreArticulo = sn.nextLine();
         sn.nextLine();
        System.out.println("Escribe El costo del producto");
        costoFijo= sn.nextFloat();
        System.out.println("Escribe porcentaje de Utilidad ");
        porcentajeDeUtilidad = sn.nextFloat();
        System.out.println("Escribe porcentaje de IVA ");
        iva = sn.nextFloat();
        System.out.printf("PRECIO DE VENTA = %.2f", (costoFijo*(100/(100-porcentajeDeUtilidad))*iva)+costoFijo*(100/(100-porcentajeDeUtilidad)));
        System.out.println();
    }
}
