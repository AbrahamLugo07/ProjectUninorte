/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author labraham
 */
public class Nodo {
    
    String key;
    Nodo RightNodo;
    Nodo LeftNodo;

    public Nodo(String key) {
        this.key = key;
        this.RightNodo = null;
        this.LeftNodo = null;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Nodo getRightNodo() {
        return RightNodo;
    }

    public Nodo getLeftNodo() {
        return LeftNodo;
    }
    


   
    
}
