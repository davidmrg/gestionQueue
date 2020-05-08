/*
Programa de gestión de Queues
 */
package gestioncolas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GestionColas {

// Definiendo la estructura Queue que va a manejar datos de tipo String, 
// El nombre de la var (obj) va a ser "cola"
    
Queue<String> cola;
  
    public static void main(String[] args) {
        
        GestionColas obj = new GestionColas();
        obj.cola = new LinkedList();
        obj.leerOpcion();
        
    }
    
    public void leerOpcion(){
         Scanner sc = new Scanner(System.in);

         int opc;
         
         do{
         
         System.out.println("Seleccione opción: ");
         System.out.println("1. Ingresa Cliente");
         System.out.println("2. Mostrar Cliente en atención");
         System.out.println("3. Finalizar atención Cliente");
         System.out.println("4. Mostrar clientes en fila");
         System.out.println("5. Salir");
         opc = sc.nextInt();
         
         switch(opc){
             case 1: 
                 ingresaCliente();
                 break;
                 
             case 2: 
                 muestraCliente();
                 break;  
     
             case 3:
                 finalizaCliente();
                 break;
                 
             case 4:
                 muestra();
                 break;
                 
                         
         }
      }while(opc!=5);
            
    }
    
    public void ingresaCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del cliente a ingresar: ");
        String nombre = sc.nextLine();
        cola.offer(nombre);
    }
    
    public void muestraCliente(){
        Scanner sc = new Scanner(System.in);
        String atendiendo = cola.peek();
        System.out.println("Nombre del cliente en atención: " + atendiendo);
    
    }
    
     public void finalizaCliente(){
        Scanner sc = new Scanner(System.in);
        String atendido = cola.poll();
        System.out.println("Nombre del cliente atendido: " + atendido);
    
    }
    
    public void muestra(){
        
        for (String clientes : cola){
                System.out.println(clientes);
                 }
        
        }
            
    }
    