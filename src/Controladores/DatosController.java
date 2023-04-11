
package Controladores;

import Modelos.DatosModel;
import Vistas.frmVistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DatosController implements ActionListener{
    frmVistaPrincipal VistaPrincipal;
    DatosModel ModelosDato;

    public DatosController(frmVistaPrincipal VistaPrincipal, DatosModel ModelosDato) {
        this.VistaPrincipal = VistaPrincipal;
        this.ModelosDato = ModelosDato;
        
        
        this.VistaPrincipal.btnCalcular.addActionListener(this);
        
        this.VistaPrincipal.setLocationRelativeTo(null);
        this.VistaPrincipal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.VistaPrincipal.btnCalcular){
            this.ModelosDato.Lista(this.VistaPrincipal.txtCodigo.getText(),
                    this.VistaPrincipal.txtPais.getText());            
        }
    }
}
