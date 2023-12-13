/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.emb_jenkins;
import java.util.Scanner;
/**
 *
 * @author eliam
 */
public class Emb_jenkins {

    public static boolean dia_laboral(String dia) {
        switch (dia) {
            case "Lunes":
                return true;
            case "Martes":
                return true;
            case "Miercoles":
                return true;
            case "Jueves":
                return true;
            case "Viernes":
                return true;
            case "Sabado":
                return false;
            case "Domingo":
                return false;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca un día en el formato 'Lunes': ");
        String dia = scanner.nextLine();
        boolean esLaboral = Emb_jenkins.dia_laboral(dia);
        
        if (esLaboral) {
            System.out.println(dia + " es un día laboral.");
        } else {
            System.out.println(dia + " no es un día laboral.");
        }
        scanner.close();
    }
    
    
}