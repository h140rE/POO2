package Controller_MVC;

import Model_MVC.Cuidador;
import View_MVC.TelaVendaServico;
import View_MVC.TelaVendas;
import View_MVC.TelaVendasProdutos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControllerVendas {

    private TelaVendas view;
    private Cuidador model;
    private TelaVendaServico viewServico;
    private TelaVendasProdutos viewProdutos;

    public ControllerVendas(TelaVendas view, Cuidador model, TelaVendaServico viewServico, TelaVendasProdutos viewProdutos) {
        this.view = view;
        this.model = model;
        this.viewProdutos = viewProdutos;
        this.viewServico = viewServico;
        view.setSize(960, 500);

        view.getjButton_Produtos().addActionListener(new AbreProdutosListener());
        view.getjButton_BuscaCliente().addActionListener(new VerificaListener());
        view.getjButton_Servicos().addActionListener(new AbreServicosListener());

    }

    class AbreProdutosListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            JOptionPane.showMessageDialog(null, "Não Implementado!!!");

        }
    }

    class VerificaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String CPF;

            CPF = view.getjTextPane3().getText();

            if (CPF.equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!!");
            } else {
                JOptionPane.showMessageDialog(null, "Não Implementado!!!");
            }
        }
    }

    class AbreServicosListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            JOptionPane.showMessageDialog(null, "Não Implementado!!!");

        }
    }

}
