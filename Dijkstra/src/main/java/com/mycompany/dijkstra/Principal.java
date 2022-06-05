/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dijkstra;

import java.util.Scanner;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author carlo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int u, z, origen = 0, nodos = 0, caso = 0, exitl = 0;
        boolean t, w = true, y = true;
        while (w == true) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("\tAlgoritmo de Dijisktra");
            System.out.println("1) Ingresar nodos");
            System.out.println("2) Ver Ejercicio");
            System.out.println("3) Salir");
            do {
                t = false;
                try {
                    System.out.println("Elije una opción");
                    caso = teclado.nextInt();

                } catch (Exception e) {
                    System.out.println("Solo numeros porfavor");
                    t = true;
                    teclado.next();
                }
            } while (t);
            switch (caso) {
                case 1:
                    while (y == true) {
                        System.out.println("Opción 1 seleccionada");
                        do {
                            t = false;
                            try {
                                System.out.println("Ingrese el numero de Nodos");
                                nodos = teclado.nextInt();
                            } catch (Exception e) {
                                System.out.println("Solo numeros porfavor");
                                t = true;
                                teclado.next();
                            }
                        } while (t);

                        Dijkstra abc = new Dijkstra();
                        System.out.println("Imprima cada unidad o costo de la matriz separada por espacios");
                        System.out.println("O puede hacerlo 1 por 1");

                        for (u = 1; u <= nodos; u++) {
                            for (z = 1; z <= nodos; z++) {
                                do {
                                    t = false;
                                    try {
                                        abc.precio[u][z] = teclado.nextInt();
                                    } catch (Exception e) {

                                        System.out.println("Solo numeros porfavor");
                                        t = true;
                                        teclado.next();
                                    }
                                } while (t);
                                if (abc.precio[u][z] == 0) {
                                    abc.precio[u][z] = 999;
                                }
                            }
                        }
                        do {
                            t = false;
                            try {
                                System.out.println("Ingresar origen de la vertice");
                                origen = teclado.nextInt();
                            } catch (Exception e) {
                                System.out.println("Solo numeros porfavor");
                                t = true;
                                teclado.next();
                            }
                        } while (t);

                        abc.calcula(nodos, origen); //resultados de los datos
                        System.out.println("El camino mas corto desde el origen '" + origen + "'a todos los demas vertices son: ");
                        for (u = 1; u <= nodos; u++) {
                            if (u != origen) {
                                System.out.println("origen:     " + origen + "Destino: " + u + "Costo Minimo: " + abc.dist[u]);
                            }
                        }
                        System.out.println("----------------------------------");
                        System.out.println("1) Regresar al menu principal");
                        System.out.println("2) Seleccionar algun numero para volver a empezar");
                        do {
                            t = false;
                            try {
                                System.out.println("Seleccione el tipo de caso");
                                exitl = teclado.nextInt();
                            } catch (Exception e) {
                                System.out.println("Solo numeros porfavor");
                                t = true;
                                teclado.next();
                            }
                        } while (t);
                        if (exitl == 1) {
                            y = false;
                        }
                    }
                    break;
                case 2:
                    Ejercicio abierto = new Ejercicio();
                    abierto.setVisible(true);
                    abierto.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    break;
                case 3:
                    System.out.println("Saliendo.");
                    System.exit(0);
                    break;
            }

        }

    }

}
