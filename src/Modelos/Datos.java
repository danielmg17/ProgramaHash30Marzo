package Modelos;

/**
 *
 * @author umg
 */
public class Datos {
    String pais;
    String codigo;

    public Datos(String pais, String codigo) {
        this.pais = pais;
        this.codigo = codigo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
   
}
