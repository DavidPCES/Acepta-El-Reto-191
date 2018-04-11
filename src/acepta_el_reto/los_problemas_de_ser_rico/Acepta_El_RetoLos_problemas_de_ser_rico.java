/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acepta_el_reto.los_problemas_de_ser_rico;

import java.util.Scanner;

/**
 *
 * @author Septimus
 */
public class Acepta_El_RetoLos_problemas_de_ser_rico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);/*Funcion Scanner usada para leer por pantalla los datos introducidos*/

        int nveces = sc.nextInt();/*Iniciar Numero de veces que se quiere hacer el programa*/
        int sol;
        

        for (int i = 0; i < nveces; i++) 
        {
            
        int npeceras = sc.nextInt();/*<Pide variables>*/
        int maxtam = sc.nextInt();
        int diff = sc.nextInt();/* </Pide variables>*/
        
        sol=maxtam;
        
        for(int j=0;j<npeceras;j++)
        {
           
            maxtam=maxtam-diff;/*Restas el valor de la diferencia al valor maximo del tamaño de la pecera*/
           
            sol+=maxtam;/*Sumas el valor del tamaño maximo de la pecera a sol, que se imprimira posteriormente*/
        }
        
            System.out.println(sol-maxtam);/*Necesidad de restar el ultimo valor de maxtam, valor inicial 1650*/
            
       
     
            
            
        }

    }

}
