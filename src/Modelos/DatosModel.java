
package Modelos;

import java.util.*;
import javax.swing.JOptionPane;


public class DatosModel {
    
    HashMap MiListas = new HashMap();
    
    public void Lista(String cod, String nom)
    {
     
       System.out.println("-----Usando Lamda");
        MiListas.forEach((clave, valor)->{
            //JOptionPane.showMessageDialog(null,clave+""+valor);
            System.out.println(clave+" " +valor);       
        });
        
        if(MiListas.containsKey(cod)){
            JOptionPane.showMessageDialog(null,"El Registro ya existe!!!");
            //System.out.println("El Registro ya existe!!!");
        }else{
            MiListas.put(cod, nom);
            JOptionPane.showMessageDialog(null,"Registrado!!!");
            //System.out.println("Registrado!!!");
        }
       
    }
    
    public void Comparar(String cod, String nom)
    {
        if(MiListas.containsKey(nom)){
            System.out.println("Ya existe!!!");
        }
    }
}
