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
public class Respuesta5 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int manzana;
                    int pera;
                    int piña;
                    int naranja;
                    int fresa;
                    int melon;
                    System.out.println("*** CALCULO DE CALORIAS COMBINACION DE FRUTAS\n ***");
                    System.out.println("cuantas manzanas ha consumido?");
                    manzana = sn.nextInt();
                    System.out.println("cuantas peras ha consumido?");
                    pera = sn.nextInt();
                    System.out.println("cuantas piña ha consumido?");
                    piña = sn.nextInt();
                    System.out.println("cuantas naranja ha consumido?");
                    naranja = sn.nextInt();
                    System.out.println("cuantas fresas ha consumido?");
                    fresa = sn.nextInt();
                    System.out.println("cuantas melon ha consumido?");
                    melon = sn.nextInt();
                    int totalCalorias = (manzana*52)+(pera*55)+(naranja*45)+(melon*54);
                    System.out.println("manzanas-> " + manzana);
                    System.out.println("peras-> " + pera);
                    System.out.println("piña-> " + piña);
                    System.out.println("naranja-> " + naranja);
                    System.out.println("fresa-> " + fresa);
                    System.out.println();
                    System.out.println("melon-> " + melon);
                    System.out.println("** Total calorias ** -> [ "+totalCalorias+"]");  
    }
    
}
