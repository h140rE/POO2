package Controller_MVC;

import View_MVC.*;
import Model_MVC.*;

import View_MVC.TelaVendaServico;
import View_MVC.TelaVendas;
import View_MVC.TelaVendasProdutos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControllerVendas {

    private TelaVendas view;
    private Cuidador model;
    private TelaVendaServico viewServico;
    private TelaVendasProdutos viewProdutos;
    private JanelaPrincipal viewprinc;
    private SQL testesql;

    public ControllerVendas(JanelaPrincipal viewprinc, TelaVendas view, Cuidador model, TelaVendaServico viewServico, TelaVendasProdutos viewProdutos,
             SQL testesql) {
        this.view = view;
        this.model = model;
        this.viewProdutos = viewProdutos;
        this.viewServico = viewServico;
        this.viewprinc = viewprinc;
        this.testesql = testesql;
        view.setSize(960, 500);

        view.getjButton_Produtos().addActionListener(new AbreProdutosListener());
        view.getjButton_BuscaCliente().addActionListener(new VerificaListener());
        view.getjButton_Servicos().addActionListener(new AbreServicosListener());

    }

    class AbreProdutosListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            viewProdutos.getjTextField3().setText(view.getjTextField1().getText());
            viewprinc.getDesktopPanel().add(viewProdutos);
            viewProdutos.show();
        }
    }

    class VerificaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String CPF = view.getjTextPane3().getText();

            if (CPF.equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!!");
            } else {
                try {
                    Cliente c = testesql.getClienteBanco(CPF);
                    if (c == null) {
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado!!!");
                    }
                    view.getjTextField1().setText(c.getNome());

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControllerAtendente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ControllerAtendente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    class AbreServicosListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            viewServico.getjTextField3().setText(view.getjTextField1().getText());
            viewprinc.getDesktopPanel().add(viewServico);
            viewServico.show();

        }
    }

}
