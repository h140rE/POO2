package Controller_MVC;

import Model_MVC.Atendente;
import Model_MVC.Cuidador;
import View_MVC.TelaAtendente;
import View_MVC.TelaHBT;
import View_MVC.TelaInicial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerTelaPrincipal {

    private TelaInicial view;
    private TelaAtendente viewAtendente;
    private TelaHBT viewBanho;


    public ControllerTelaPrincipal(TelaInicial view, TelaAtendente tela2, TelaHBT tela3) {
        this.view = view;
        this.viewAtendente = tela2;
        this.viewBanho = tela3;
        //viewAtendente.getDesktopPanel().setSize(1000, 500);
        
    }
    
    class AtendenteListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           
            viewAtendente.setVisible(true);

        }
    }
    
    class BanhoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            
            viewBanho.setVisible(true);
        }
    }
}
