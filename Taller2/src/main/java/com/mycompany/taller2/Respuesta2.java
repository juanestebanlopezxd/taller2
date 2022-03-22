
package com.mycompany.taller2;

public class Respuesta2 {
    public static void main(String[] args) {
        int numero1=2; 
        int numero2=5;  
        int numero3=8;
        System.out.printf("numero1 = %d\n numero2=%d\n numero3= %d\n ", numero1,numero2,numero3 );
        System.out.printf("La suma de %d + %d + %d es %d\n", numero1, numero2, numero3,( numero1 + numero2 +numero3 ) );
        System.out.printf("El promedio de los numeros es:  %d/3 = %.2f\n", (numero1 + numero2 +numero3), (float)numero1 + numero2 +numero3/3 );
        System.out.printf("El Producto  de %d x %d x %d = %d\n", numero1,numero2,numero3, (numero1*numero2*numero3) );
        System.out.printf("El cosiente de los 3 numeros divididos entre 2 es: %d/2= %.2f\n , %d/2= %.2f\n , %d/2= %.2f\n", numero1,(float)numero1/2, numero2,(float)numero2/2, numero3, (float)numero3/2);
        System.out.printf("El modulo de los numeros es: %d/2= %d\n  %d/2= %d\n  %d/2= %d\n", numero1, numero1%2, numero2,numero2%2, numero3, numero3%2);
    }
    
}
