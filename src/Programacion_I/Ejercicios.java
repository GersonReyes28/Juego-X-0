/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programacion_I;
import java.util.Scanner;

public class Ejercicios {
    public static void main(String []arg)
    {
        //instanciador
       Scanner leer= new Scanner(System.in) ;
       
       //Variables
       String NombreEpleado;
       int  HorasTrabajadas=0;
       double HorasNormales=0,HorasExtras=0,PagoHorasNormales=0,PagoHorasExtras=0;
       double Rap=0.0, Subtotal=0.0, TotalPagar=0.0;
       
       
       //Ingresar los valores desde el teclado
       System.out.print("Ingrese  Nombre del Empleado: ");
       NombreEpleado=leer.nextLine();
       System.out.print("Ingrese las Horas Trabajadas: ");
       HorasTrabajadas=leer.nextInt();
       
       //Evaluar
       if(HorasTrabajadas>40)
       {
       HorasNormales=40;
       HorasExtras=HorasTrabajadas-40;
       PagoHorasNormales=6000;
       PagoHorasExtras=HorasExtras*250;
       
       Subtotal= PagoHorasNormales + PagoHorasExtras;
       
       }else if(HorasTrabajadas>=25 && HorasTrabajadas<=40){
       
       HorasNormales=HorasTrabajadas;   
       PagoHorasNormales=HorasTrabajadas*150;
       Subtotal=PagoHorasNormales;
       
       }else{
           System.out.println("\"NO CUMPLIÓ CON SUS HORAS NORMALES\"");
       
       }//ciere del if
       
       Rap=Subtotal*0.035;
       TotalPagar=Subtotal-Rap;
       
       
       //Impresiones en pantalla
       System.out.println("Horas Trabajadas: " + HorasTrabajadas);
       System.out.println("Horas Normales: " + HorasNormales);
       System.out.println("Horas Extras: " + HorasExtras);
       System.out.println("Pago Horas Normales: " + PagoHorasNormales);
       System.out.println("Pago Horas Extras: " + PagoHorasExtras);
       System.out.println("Subtotal:"+ Subtotal +
                "\nRap:"+ Rap+
                "\nTotal a Pagar: " + TotalPagar);  
    }
    
     

}
