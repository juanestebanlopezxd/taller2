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
public class Respuesta4 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int numeroDeDiasDelViaje;
                    float totalKilometrosPorDias;
                    float costoPorLitrosDeGasolina;
                    float promedioDeKilometroPorLitroDeGasolina;
                    int pagoPorEstacionamientoPorDía;
                    int numeroDepeajes;
                    int pagoDePeajesPorDía;
                    
                    System.out.println("escribe cuanto duro el viaje?");
                    numeroDeDiasDelViaje = sn.nextInt();
                    System.out.println("escribe cual fue el total de kilometros por dia?"); 
                    totalKilometrosPorDias = sn.nextFloat();
                    System.out.println("escribe cual fue el costo por litro de gasolina?"); 
                    costoPorLitrosDeGasolina = sn.nextFloat();
                    System.out.println("escribe cual fue el pago por estacionamiento por dia?");
                    pagoPorEstacionamientoPorDía = sn.nextInt();
                    System.out.println("escribe cual fue el total de peajes?");
                    numeroDepeajes = sn.nextInt();
                    System.out.println("escribe cual fue el pago de peaje por dia?");
                    pagoDePeajesPorDía = sn.nextInt();
                    System.out.println("promedio de kilometro por litro de gasolina?");
                    promedioDeKilometroPorLitroDeGasolina = sn.nextFloat();
                    
                    float litrosDeGasolina = totalKilometrosPorDias/promedioDeKilometroPorLitroDeGasolina;
                    float CostoTotal = numeroDeDiasDelViaje*((costoPorLitrosDeGasolina*litrosDeGasolina)+pagoPorEstacionamientoPorDía+(pagoDePeajesPorDía*numeroDepeajes));
                    System.out.println("**** CUENTAS DEL DIA DE VIAJE ****");
                    System.out.println("numero de dias del viaje " +numeroDeDiasDelViaje);
                    System.out.printf("total  kilometros por dias %.2f",totalKilometrosPorDias);
                    System.out.println();
                    System.out.printf("costo por litros de gasolina %.2f",costoPorLitrosDeGasolina);
                    System.out.println();
                    System.out.println("pago por estacionamiento por dia " + pagoPorEstacionamientoPorDía);
                    System.out.println(" Numero de peaje " +numeroDepeajes );
                    System.out.println("pago de peaje por dia " + pagoDePeajesPorDía);
                    System.out.printf("Promedio de kilometros por litro de gasolina %.2f",promedioDeKilometroPorLitroDeGasolina);
                    System.out.println();
                    System.out.printf("***COSTO TOTAL DEL VIAJE--> [[ %.2f ]]",CostoTotal);
                    System.out.println();
    }
}
