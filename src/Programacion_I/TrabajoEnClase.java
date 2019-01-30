/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programacion_I;
import java.util.Scanner;
/**
 *
 * @author GERSON
 */
public class TrabajoEnClase {
    public static void main(String[]arg){
        //Variables
       int numero =0;
       int Suma = 0;
       double Promedio=0.0;
       int Pares = 0;
       int Contador=0;
       int Subtotal=0;
       int valoresPares =0;
       
       
       
       Scanner Lea=new Scanner(System.in);
       
       do{
           System.out.print("Ingrese un Numero:");
           numero=Lea.nextInt();
           
           
           if(numero<0)
               break;
           
           Suma += numero;
           Contador++;
           Promedio=Suma/Contador;
           
           
           if(numero%2==0){
            valoresPares++;
           }
            
               
         }while(numero>=0);
      
         System.out.println("Numeros Pares : " + valoresPares);
         System.out.println("Promedio :" + Promedio);
         System.out.println("Suma : " + Suma);
         System.out.println("Se ingresaron :" + Contador + " numeros" );
    }
}
    

