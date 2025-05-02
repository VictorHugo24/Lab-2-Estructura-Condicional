/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodriguez_victor_hugopagos;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Rodriguez_Victor_HugoPagos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float horasExtras=0, salario = 0, horasExtrasP=0, SalarioNeto=0;
        int temp=0, horasSalario = 0;
        Scanner lea = new Scanner (System.in);
        lea.useDelimiter("\n");
        
        System.out.print("Por favor ingrese su nombre y apellido: ");
        String nombre = lea.next();
        System.out.print("Ingrese su numero de empleado: ");
        int Nempleado = lea.nextInt();
        System.out.print("Ingrese sus horas trabajadas: ");
        int horas = lea.nextInt();
        System.out.print("Ingrese su numero de categoria: ");
        int cat = lea.nextInt();
        
        switch (cat){
           
            case 1:
                if(horas > 40){
                    temp = horas-40;
                    if(temp > 15 ){
                        horasSalario=40;
                        horasExtras=15;
                    }else{
                        horasSalario=40;
                        horasExtras=temp;
                    }
                }else{
                    horasSalario=horas;
                }
         
             salario=(float) (horasSalario*35.99);
             horasExtrasP = horasExtras*40;
             SalarioNeto=salario+horasExtrasP;
                
                break;
            case 2:
                if(horas > 40){
                    temp = horas-40;
                    if(temp > 15 ){
                        horasSalario=40;
                        horasExtras=15;
                    }else{
                        horasSalario=40;
                        horasExtras=temp;
                    }
                }else{
                    horasSalario=horas;
                }
         
             salario=(float) (horasSalario*35.99);
             horasExtrasP = horasExtras*50;
             SalarioNeto=salario+horasExtrasP;
                break;
            case 3:
                if(horas > 40){
                    temp = horas-40;
                    if(temp > 15 ){
                        horasSalario=40;
                        horasExtras=15;
                    }else{
                        horasSalario=40;
                        horasExtras=temp;
                    }
                }else{
                    horasSalario=horas;
                }
         
             salario=(float) (horasSalario*35.99);
             horasExtrasP = horasExtras*85;
             SalarioNeto=salario+horasExtrasP;
                break;
            case 4:
                if(horas > 40){
                    temp = horas-40;
                    if(temp > 15 ){
                        horasSalario=40;
                        horasExtras=15;
                    }else{
                        horasSalario=40;
                        horasExtras=temp;
                    }
                }else{
                    horasSalario=horas;
                }
         
             salario=(float) (horasSalario*35.99);
             horasExtrasP = horasExtras*0;
             SalarioNeto=salario+horasExtrasP;
                break;
           
        }
        
        System.out.println("****DETALLE DE PAGO****");
        System.out.println("Información de Categorías\n" +
"\n" +
"Categoría 1 - $40 por hora extra\n" +
"\n" +
"Categoría 2 - $50 por hora extra\n" +
"\n" +
"Categoría 3 - $85 por hora extra.\n" +
"\n" +
"Categoría 4 - $0");
        System.out.println("Nombre del empleado: "+nombre);
        System.out.println("Numero de empleado: "+Nempleado);
        System.out.println("Horas trabajadas: "+horas);
        System.out.println("Salario base: "+salario+"$.");
        System.out.println("Horas Extras: "+horasExtrasP+"$.");
        System.out.println("Salario Neto: "+SalarioNeto+"$.");
    }
    
}
