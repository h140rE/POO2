package Controller_MVC;

import Model_MVC.Atendente;
import Model_MVC.Cliente;
import View_MVC.TelaAtendente;
import View_MVC.TelaConsulta;
import View_MVC.TelaHBT;
import View_MVC.TelaVendas;
import View_MVC.Tela_Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerTelaPrincipal {

    private Tela_Principal view;
    private TelaAtendente viewAtendente;
    private ControllerAtendente controllerAtendente;
    private Atendente modelAtendente;
    private TelaHBT viewBanho;
    private ControllerHBT controllerBanho;
    private TelaConsulta viewConsulta;
    private ControllerConsulta controllerConsulta;

    public ControllerTelaPrincipal(Tela_Principal view) {
        this.view = view;

        view.getjButton1().addActionListener(new AtendenteListener());
        view.getjButton3().addActionListener(new BanhoListener());
        view.getjButton4().addActionListener(new ConsultaListener());

    }

    class AtendenteListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            viewAtendente = new TelaAtendente();
            viewAtendente.setVisible(true);
            modelAtendente = new Atendente();
            controllerAtendente = new ControllerAtendente(modelAtendente,viewAtendente);
        }
    }
    
    class BanhoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            viewBanho = new TelaHBT();
            viewBanho.setVisible(true);
            controllerBanho = new ControllerHBT(viewBanho);
        }
    }
    
    class ConsultaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            viewConsulta = new TelaConsulta();
            viewConsulta.setVisible(true);
            controllerConsulta = new ControllerConsulta(viewConsulta);
        }
    }

}
