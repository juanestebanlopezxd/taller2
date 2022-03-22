
package com.mycompany.taller2;

import java.util.Scanner;


public class Taller2 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
        
       while(!salir){
            
           System.out.println("1.Pregunta 1 ");
           System.out.println("2.pregunta 2");
           System.out.println("3.pregunta 3");
           System.out.println("4.pregunta 4");
           System.out.println("5.pregunta 5");
           System.out.println("6. Salir");
            
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
            
           switch(opcion){
               case 1:
                   System.out.println("Has seleccionado la opcion 1");
                           int x=3;
                            System.out.printf("x = %d\n", x );
                            System.out.printf("El valor de %d + %d es %d\n", x, x, ( x + x ) );
                            System.out.printf("El valor de %d / 2 = %.2f\n", x, (float)x/2 );
                            System.out.printf("El valor de %d mod 3 = %d\n", x, x%3 );
                   break;
               case 2:
                   System.out.println("Has seleccionado la opcion 2");
                   int numero1=2; 
                   int numero2=5;  
                   int numero3=8;
                   System.out.printf("numero1 = %d\n numero2=%d\n numero3= %d\n ", numero1,numero2,numero3 );
                   System.out.printf("La suma de %d + %d + %d es %d\n", numero1, numero2, numero3,( numero1 + numero2 +numero3 ) );
                   System.out.printf("El promedio de los numeros es:  %d/3 = %.2f\n", (numero1 + numero2 +numero3), (float)numero1 + numero2 +numero3/3 );
                   System.out.printf("El Producto  de %d x %d x %d = %d\n", numero1,numero2,numero3, (numero1*numero2*numero3) );
                   System.out.printf("El cosiente de los 3 numeros divididos entre 2 es: %d/2= %.2f\n , %d/2= %.2f\n , %d/2= %.2f\n", numero1,(float)numero1/2, numero2,(float)numero2/2, numero3, (float)numero3/2);
                   System.out.printf("El modulo de los numeros es: %d/2= %d\n  %d/2= %d\n  %d/2= %d\n", numero1, numero1%2, numero2,numero2%2, numero3, numero3%2);
                   break;
                case 3:
                   System.out.println("Has seleccionado la opcion 3");
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
                   break;
                case 4:
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
                    break;
                case 5:
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
                break;
                case 6:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 4");
           }
        
       }
    }
}