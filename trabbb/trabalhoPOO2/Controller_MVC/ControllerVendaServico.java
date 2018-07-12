package Controller_MVC;

import View_MVC.TelaVendaServico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControllerVendaServico {
    
    private TelaVendaServico view;
    
     public ControllerVendaServico(TelaVendaServico view) {
        this.view = view;
        
        view.getjButton4().addActionListener(new VoltaListener());
     }
     
     class VoltaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           view.dispose();
        }
    }
}
