/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_MVC;

import Model_MVC.Atendente;
import View_MVC.JanelaPrincipal;
import View_MVC.TelaAtendente;
import View_MVC.TelaConsulta;
import View_MVC.TelaHBT;
import View_MVC.TelaVendas;
import View_MVC.TelaInicial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerJFrame {
        JanelaPrincipal view;
        TelaInicial viewTelaInicio;
        Atendente modelAtendente = new Atendente("nome", "111.222.333-44", "(34) 99999999", 1);
    
        public ControllerJFrame(){
        view = new JanelaPrincipal();
        view.setSize(1000,500);
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        
        
        viewTelaInicio = new TelaInicial();
        view.add(viewTelaInicio);
        viewTelaInicio.show();
        
        view.getjMenuItem_Atendente().addActionListener(new MenuAtendenteListener());
        
        }
        
        class MenuAtendenteListener implements ActionListener{
               
        @Override
        public void actionPerformed(ActionEvent ae) {
            
        }
        }

    public JanelaPrincipal getView() {
        return view;
    }
        
}
