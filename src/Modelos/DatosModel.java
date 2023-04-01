
package Modelos;

import java.util.*;


public class DatosModel {
    
    
    public void Lista(String cod, String nom)
    {
     
       HashMap MiListas = new HashMap();
       MiListas.put(cod, nom);
       System.out.println("-----Usando Lamda");
        MiListas.forEach((clave, valor)->{
            System.out.println(clave+" " +valor);
                    });
    }
}
