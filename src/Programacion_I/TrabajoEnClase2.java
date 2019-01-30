/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programacion_I;
import java.util.Scanner;
public class TrabajoEnClase2 {
    public static void main(String[] args) {
        
        //variable
        
       String Palabra =" ";
       int contador =0;
       
       Scanner leer = new Scanner(System.in);
       
       while(Palabra!= "Salir" )
       {  
        contador=0;
        System.out.print("Ingrese una palabra: ");
        Palabra=leer.nextLine();
        
           while(contador<Palabra.length()){
           System.out.println(Palabra.charAt(contador));
           contador++;
          }
        
       }
    }
}
