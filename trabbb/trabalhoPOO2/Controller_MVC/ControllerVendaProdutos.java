package Controller_MVC;

import View_MVC.TelaVendasProdutos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControllerVendaProdutos {
    
    
    private TelaVendasProdutos view;
    
     public ControllerVendaProdutos(TelaVendasProdutos view) {
        this.view = view;
        
        view.getjButton2().addActionListener(new ConfirmaEntradaListener());
        
}
     class VerificaDadosListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String CPFDono;

        }
    }
     
     class ConfirmaEntradaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String CPFDono;


            
        }
    }
     
     
     
}
