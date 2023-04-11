
package Modelos;

import java.util.*;


public class DatosModel {
    
    HashMap MiListas = new HashMap();
    
    public void Lista(String cod, String nom)
    {
     
       System.out.println("-----Usando Lamda");
        MiListas.forEach((clave, valor)->{
            System.out.println(clave+" " +valor);       
        });
        
        if(MiListas.containsKey(cod)){
            System.out.println("El Registro ya existe!!!");
        }else{
            MiListas.put(cod, nom);
            System.out.println("Registrado!!!");
        }
       
    }
    
    public void Comparar(String cod, String nom)
    {
        if(MiListas.containsKey(nom)){
            System.out.println("Ya existe!!!");
        }
    }
}
