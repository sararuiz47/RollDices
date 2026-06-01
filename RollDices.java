/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rolldices;

/**
 *
 * @author Valentina
 */
import java.util.Random;
public class RollDices {
    
    

    public static int RollDices() {
        
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public static void main(String[] args) {

        int vidas = 5;
        int lanzamiento = 0;

        int totalPar = 0;
        int totalImpar = 0;
        int totalIguales = 0;

        int igualesConsecutivos = 0;

        while (vidas > 0) {

            lanzamiento++;

            int dice1 = RollDices();
            int dice2 = RollDices();

            int suma = dice1 + dice2;

            System.out.println("\nL" + lanzamiento);
            System.out.println("Dado 1: " + dice1);
            System.out.println("Dado 2: " + dice2);
            System.out.println("Suma: " + suma);
            System.out.println("Vidas: " + vidas);

            
            if (dice1 == dice2) {
                totalIguales++;
                igualesConsecutivos++;

                
                if (dice1 == 6) {
                    vidas++;
                    System.out.println("¡Par de seis! Ganas una vida.");
                }

            } else {
                igualesConsecutivos = 0;
            }

            
            if (suma % 2 == 0) {
                totalPar++;
                System.out.println("La suma es PAR.");
            } else {
                totalImpar++;
                vidas--;
                System.out.println("La suma es IMPAR. Pierdes una vida.");
            }

            
            if (igualesConsecutivos == 3) {
                System.out.println("\nYOU WIN");
                break;
            }

            
            if (vidas <= 0) {
                System.out.println("\nGAME OVER");
                break;
            }
        }

     
        System.out.println("\n===== INFORME FINAL =====");
        System.out.println("Número total de lanzamientos: " + lanzamiento);
        System.out.println("Total de tiros con suma par: " + totalPar);
        System.out.println("Total de tiros con suma impar: " + totalImpar);
        System.out.println("Total de tiros con dados iguales: " + totalIguales);
    }
}
    

