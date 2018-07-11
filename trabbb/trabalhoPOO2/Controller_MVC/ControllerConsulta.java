package Controller_MVC;

import Model_MVC.Veterinario;
import View_MVC.TelaConsulta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControllerConsulta {

    private TelaConsulta view;
    private Veterinario model;

    public ControllerConsulta(TelaConsulta view, Veterinario model) {
        this.view = view;
        this.model = model;
        view.setSize(960, 500);

        view.getjButton_TelaSistemaDeConsultas_Verificar().addActionListener(new VerificaListener());
        view.getjButton1().addActionListener(new AdicionaProdutoListener());
        view.getjButton2().addActionListener(new ConfirmaProdutoListener());
        view.getjRadioButton1().addActionListener(new AddProdutoListener());
        view.getjRadioButton2().addActionListener(new ControleProdutoListener());

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
    
    class AdicionaProdutoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String Produto;

            Produto = view.getjTextField1().getText();
            
            if (Produto.equals("")) {

                JOptionPane.showMessageDialog(null, "Preencha todos os campos!!");
                
            } else {
                JOptionPane.showMessageDialog(null, "Não Implementado!!!");
            }

        }

    }
    
    class ConfirmaProdutoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            JOptionPane.showMessageDialog(null, "Não Implementado!!!");

            
        }

    }

    class AddProdutoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            JOptionPane.showMessageDialog(null,view.getjRadioButton1().getText());

            
        }

    }
    
    class ControleProdutoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            JOptionPane.showMessageDialog(null,view.getjRadioButton1().getText());

            
        }

    }
}
