/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodriguez_victor_hugotiempo;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Rodriguez_Victor_HugoTiempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lea = new Scanner(System.in);
        
        int horas=0, minutos=0, segundosF=0;
        
        System.out.print("Favor ingrese el numero a convertir: ");
        int segundos = lea.nextInt();
                
     String resultado = (segundos > 0) 
            ? "Horas: " + (segundos / 3600) + ", Minutos: " + ((segundos % 3600) / 60) + ", Segundos: " + (segundos % 60)
            : "No se permite ese valor";
        
        
        System.out.println(resultado);

    }
    
}
