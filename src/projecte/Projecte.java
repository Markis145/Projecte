/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Projecte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent = new Scanner(System.in);
        String nom = null;
        String genere = null;
        double preu = 0.0;
        boolean multijugador = false, omplit = false;
        int hores = 0, menu = 5;

        while (!(menu < 1)) {
            System.out.println("-------MENU-------");
            System.out.println("Selecciona la opció desitjada");
            System.out.println("0. Sortir");
            System.out.println("1. Insertar videojoc");
            System.out.println("2. Borrar videojocs");
            System.out.println("3. Modificar videojoc");
            System.out.println("4. Llistar videojocs");
            menu = ent.nextInt();

            switch (menu) {
                case 0:
                    System.out.println("Sortint del programa...");
                    break;
                case 1:
                    if (!(omplit=true)) {
                        System.out.println("Inserta les dades sobre el videojoc");
                    }
                    omplit = true;
                    break;
                case 2:
                    System.out.println("asdkjlasd");
                    omplit = false;
                    break;
                case 3:
                    System.out.println("akdopasdsald");
                    break;
                case 4:
                    System.out.println("aklsdjaskldjaslkd");
                    break;
                default:
                    System.out.println("Opció incorrecta! GTFO");
                    break;
            }

        }
    }

}
