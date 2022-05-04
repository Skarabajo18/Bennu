/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bennu;
import java.util.ArrayList;
/**
 *
 * @author felip
 */
public class Numero {
    private int dato;

 public Numero(){
        
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    //public void agregar(ArrayList<Integer>numbR, int valor){
    //     numR.add(dato, valor);
    //}
    
    public void Mostrar(ArrayList<Integer> numR){
        for (int i=0; i<numR.size(); i++)
        {
            System.out.println("Elnumero almacenado es"+ numR.get(i));
        }
    }       

}


