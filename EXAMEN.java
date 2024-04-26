/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen;

import java.util.Scanner;

/**
 *
 * @author NAHILEA
 */
public class EXAMEN {

    public static void main(String[] args) {
        //TODO code application logic here
        
        int usuario;
        int computadora;
        int piedra;
        int papel;
        int tijera;
        
        Scanner captu = new Scanner (System.in);
        usuario = captu.nextInt();
        System.out.println("Quien ganara");
        computadora = captu.nextInt();
        piedra = captu.nextInt();
        papel = captu.nextInt();
        tijera = captu.nextInt();
        
        
        
        
        if (usuario > computadora )
            System.out.println(usuario + "usuario contra computadora!!!");
        else{
            if(usuario==computadora) 
                System.out.println("quien ganara en piedra, papel o tijera");
            else
                System.out.println(computadora+ "usuario le gano!!");
            
        }
    }
}
