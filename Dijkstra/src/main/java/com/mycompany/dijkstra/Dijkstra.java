/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dijkstra;

/**
 *
 * @author carlo
 */
public class Dijkstra {

    public int precio[][] = new int[10][10];
    public int dist[] = new int[10];

    public void calcula(int x, int y) {
        int indi[] = new int[x + 1];
        int u, costomin = 1, c, d, minimo;
        //variable distancia
        for (u = 1; u < x; u++) {
            indi[u] = 0;
            this.dist[u] = this.precio[y][u];
        }
        c = 2;
        while (c <= x) {
            minimo = 99;
            for (d = 1; d <= x; d++) {
                if (this.dist[d] < minimo && indi[d] != 1) {
                    minimo = this.dist[u];
                    costomin = d;
                }
            }

            indi[costomin] = 1;
            c++;
            for (d = 1; d <= x; d++) {
                if (this.dist[costomin] + this.precio[costomin][d] < this.dist[d] && indi[d] != 1) 
                    this.dist[d] = this.dist[costomin] + this.precio[costomin][d];
                }
            }
            
            
        }

    }

