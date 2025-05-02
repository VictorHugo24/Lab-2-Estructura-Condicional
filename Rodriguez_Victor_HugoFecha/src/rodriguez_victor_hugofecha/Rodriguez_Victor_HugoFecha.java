/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodriguez_victor_hugofecha;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Rodriguez_Victor_HugoFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        System.out.print("Ingrese la primera fecha (Día/Mes/Año): ");
        String fecha1 = lea.nextLine();
        System.out.print("Ingrese la segunda fecha (Día/Mes/Año): ");
        String fecha2 = lea.nextLine();
        
        int dia1 = Integer.parseInt(fecha1.substring(0, 2));
        int mes1 = Integer.parseInt(fecha1.substring(3, 5));
        int año1 = Integer.parseInt(fecha1.substring(6, 10));
        
        int dia2 = Integer.parseInt(fecha2.substring(0, 2));
        int mes2 = Integer.parseInt(fecha2.substring(3, 5));
        int año2 = Integer.parseInt(fecha2.substring(6, 10));
        
        int totalDias1 = año1 * 360 + (mes1 - 1) * 30 + dia1;
        int totalDias2 = año2 * 360 + (mes2 - 1) * 30 + dia2;
        
        int diferencia = Math.abs(totalDias1 - totalDias2);
        
        System.out.println("La diferencia entre las dos fechas es de " + diferencia + " días.");
            
    }
    
}
