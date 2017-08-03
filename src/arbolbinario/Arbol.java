/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

import java.util.ArrayList;

/**
 *
 * @author labraham
 */
public class Arbol {
    ArrayList<Nodo> nodos;

    public Arbol(String rootKey) {
        nodos = new ArrayList();
        nodos.add(new Nodo(rootKey));
    }
    
    public void addNodo(String father, String Key, Boolean isRight){
        for (Nodo root : nodos) {
            if(root.getKey().equals(father)){
                nodos.add(new Nodo(Key));
                if(isRight){
                    root.RightNodo = nodos.get(nodos.size()-1);
                }else{
                    root.LeftNodo = nodos.get(nodos.size()-1);

                }
                break;
            }
        }
        
    }
    
    public void PreOrden(Nodo root){
        if(root != null){
            System.out.println(root.getKey());
            PreOrden(root.getLeftNodo());
            PreOrden(root.getRightNodo());
        }
        
    }
    
    public void InOrden(Nodo root){
        if(root != null){            
            PreOrden(root.getLeftNodo());
            System.out.println(root.getKey());
            PreOrden(root.getRightNodo());
        }
        
    }
     public void PosOrden(Nodo root){
        if(root != null){            
            PreOrden(root.getLeftNodo());            
            PreOrden(root.getRightNodo());
            System.out.println(root.getKey());
        }
        
    }
    
}
