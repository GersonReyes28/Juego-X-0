/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programacion_I;
import java.util.Scanner;


public class Proyecto_I {
    public static void main(String[] arg)
    {
        //Variables
        int Opcion = 0;
        String TipoCliente ="";
        String TipoProveedor="";
        
        
        //Instanciador
       Scanner leer= new Scanner(System.in);
       
       //Menú Principal
        do 
        {  
            System.out.println("*** M E N Ú  P R I N C I P A L ***\n");
            System.out.println("1.Abrir caja");
            System.out.println("2.Ventas");
            System.out.println("3.Compras");
            System.out.println("4.Reportes");
            System.out.println("5.Cierre de caja");
            System.out.println("6.Salir del Sistema\n");
            
            System.out.print("Selecciones una opción:");
            Opcion=leer.nextInt();
            
           
            switch(Opcion)
            {   //Abrir caja
                case 1:
                    int AbrirC=0;
                    System.out.print("Ingrese la cantidad que desea agregar a caja:");
                    AbrirC=leer.nextInt();
                    
                    break;
                  
                  //Realizar ventas
                case 2:
                    int Codigo=0;
                    int CantidadKilogramos=0;
                    String CodigoProducto="";
     
                    System.out.print("Ingrese el tipo de cliente: " );
                    TipoCliente=leer.next();
                          
                    if (null != TipoCliente)switch (TipoCliente) {
                case "a":
                    System.out.print("Codigo del  producto que desea comprar :");
                    Codigo=leer.nextInt();
                    System.out.print("Cantidad de Kilogramos que desea adquirir:");
                    CantidadKilogramos=leer.nextInt();
                    
                    break;
                case "b":
                    System.out.print("Codigo del  producto que desea comprar :");
                    Codigo=leer.nextInt();
        
                    if("4".equals(CodigoProducto) )
                        System.out.println("NO PUEDE COMPRAR ESTE PRODUCTO");
                    else 
                        System.out.println("Cantidad de producto que desea:");
                     
                    break;
                case "c":
                    System.out.print("Codigo del  producto que desea comprar :");
                    break;
                default:
                    break;
            }
                        Codigo=leer.nextInt();                       
                    break;
                    
                 //Realizar Compras
                case 3:
                    int Producto=0;
                    
                    System.out.print("Ingrese el tipo de Proveedor: ");
                    TipoProveedor=leer.next();
                   
                    if ("a".equals(TipoProveedor)){
                        System.out.print("Codigo del  producto que desea comprar :"); 
                        Producto=leer.nextInt();
                    }else if ("b".equals(TipoProveedor)){
                        System.out.print("Codigo del  producto que desea comprar :");
                        Producto=leer.nextInt();
                    }else if("c".equals(TipoProveedor))
                        System.out.print("Codigo del  producto que desea comprar :");
                       Producto=leer.nextInt();
                    break;
            }
            
        }while(Opcion!= 6);
            
        
        
    }
    
}
