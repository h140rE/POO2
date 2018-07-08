package Controller_MVC;

import Model_MVC.Atendente;
import View_MVC.TelaAtendente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControllerAtendente {

    private Atendente model;
    private TelaAtendente view;

    public ControllerAtendente(Atendente model, TelaAtendente view) {
        this.model = model;
        this.view = view;
        
        view.getJButton_MenuPrincipal_Cadastro_Conformar().addActionListener(new CadastraListener());
        
    }
    
    class CadastraListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String Nome, CPF, Telefone;

            Nome = view.getjTextField1().getText();
            CPF = view.getjTextField2().getText();
            Telefone = view.getjTextField3().getText();
                        
            model.cadastrar(Nome, CPF, Telefone);
            
            

        }
    }

}
