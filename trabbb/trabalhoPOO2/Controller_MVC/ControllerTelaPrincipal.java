package Controller_MVC;

import Model_MVC.Atendente;
import Model_MVC.Cuidador;
import Model_MVC.Veterinario;
import View_MVC.TelaAtendente;
import View_MVC.TelaConsulta;
import View_MVC.TelaHBT;
import View_MVC.Tela_Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerTelaPrincipal {

    private Tela_Principal view;
    private TelaAtendente viewAtendente;
    private TelaHBT viewBanho;
    private TelaConsulta viewConsulta;


    public ControllerTelaPrincipal(Tela_Principal view, TelaAtendente tela2, TelaHBT tela3, TelaConsulta tela4) {
        this.view = view;
        this.viewAtendente = tela2;
        this.viewBanho = tela3;
        this.viewConsulta = tela4;
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
    
    class ConsultaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

 
            viewConsulta.setVisible(true);
            
        }
    }

}
