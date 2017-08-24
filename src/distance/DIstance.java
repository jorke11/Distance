/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distance;

import java.util.Scanner;

/**
 *
 * @author pinedo
 */
public class DIstance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int coor = 0;
        double dist1, dist2;
        Operations data = new Operations();
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese el numero de Coordenadas");
        coor = in.nextInt();

        Operations obj[] = new Operations[coor];

        for (int i = 0; i < obj.length; i++) {

            System.out.println("Coordenadas X" + (i + 1) + ":");
            dist1 = in.nextDouble();
            System.out.println("Coordenadas Y" + (i + 1) + ":");
            dist2 = in.nextDouble();
            obj[i] = new Operations(dist1, dist2);
        }
       

        System.out.println("La distancia mas corta: " + data.compareDistance(obj));
    }

}
