package Controller_MVC;

import Model_MVC.Cuidador;
import View_MVC.TelaHBT;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControllerHBT {

    private TelaHBT view;
    private Cuidador model;

    public ControllerHBT(TelaHBT view, Cuidador model) {
        this.view = view;
        this.model = model;
        view.setSize(960, 500);

        view.getjButton3().addActionListener(new VerificaListener());
        view.getjButton2().addActionListener(new ConfirmaEntradaListener());
        view.getjButton4().addActionListener(new ConfirmaSaidaListener());
    }

    class VerificaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String NomeAnimal, CPF;

            CPF = view.getjTextPane3().getText();
            NomeAnimal = view.getjTextPane4().getText();

            if (NomeAnimal.equals("") || CPF.equals("")) {

                JOptionPane.showMessageDialog(null, "Preencha todos os campos!!");
            } else {
                JOptionPane.showMessageDialog(null, "Não Implementado!!!");
            }

        }

    }

    class ConfirmaSaidaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            JOptionPane.showMessageDialog(null, "Não Implementado!!!");

        }
    }

    class ConfirmaEntradaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            JOptionPane.showMessageDialog(null, "Não Implementado!!!");

        }
    }
}
