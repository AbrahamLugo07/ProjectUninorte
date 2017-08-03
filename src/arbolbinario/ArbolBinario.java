/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

import java.util.Scanner;

/**
 *
 * @author labraham
 */
public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    static Arbol arbol;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        createArbol();
        System.out.println("Preorden");
        arbol.PreOrden(arbol.nodos.get(0));
        System.out.println("Inorden");
        arbol.InOrden(arbol.nodos.get(0));
        System.out.println("Posorden");
        arbol.PosOrden(arbol.nodos.get(0));
        
        
        
        
        
    }
    public static void createArbol(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Menu");
        System.out.println("1. Crear Arbol");
        System.out.println("2. Salir");
        System.out.println("Escoja una Opcion: ");
        
        int option = sc.nextInt();
        
        if(option == 1){
            System.out.println("Escriba la llave de la raiz: ");   
            String Key = sc.next();
            arbol = new Arbol(Key);
            
            while(option != 3){
                System.out.println("Menu");
                System.out.println("1. Insertar un hijo derecho");
                System.out.println("2. Insertar un Hijo izquierdo");
                System.out.println("3. Salir");
                System.out.println("Escoja una opcion: ");
                option = sc.nextInt();
                
                if(option==1 || option==2){
                    System.out.println("Father");
                    String father = sc.next();
                    System.out.println("Nodo");
                    String newKey = sc.next();
                    if(option==1){
                        arbol.addNodo(father, newKey, true);
                        
                    }else{
                        arbol.addNodo(father,newKey, false);
                    }
                    
                    
                }
                
             }
            
        }
        
        
        
        
    }
    
}
