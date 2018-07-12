package Controller_MVC;

import View_MVC.*;
import Model_MVC.*;

import View_MVC.TelaVendas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControllerVendas {

    private TelaVendas view;
    private Cuidador model;
    private JanelaPrincipal viewprinc;
    private SQL testesql;

    public ControllerVendas(JanelaPrincipal viewprinc, TelaVendas view, Atendente atendente, SQL testesql) {
        this.view = view;
        this.model = model;
        this.viewprinc = viewprinc;
        this.testesql = testesql;
        view.setSize(960, 500);

    
        view.getjButton_BuscaCliente().addActionListener(new VerificaListener());
 

    }

    class VerificaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String CPF = view.getTextoCPF().getText();

            if (CPF.equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!!");
            } else {
                try {
                    Cliente c = testesql.getClienteBanco(CPF);
                    if (c == null) {
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado!!!");
                    }
                    view.getTextoNomeCliente().setText(c.getNome());

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControllerAtendente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ControllerAtendente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
    
    
    private void preencheTabela(){
        
    }
    

}
