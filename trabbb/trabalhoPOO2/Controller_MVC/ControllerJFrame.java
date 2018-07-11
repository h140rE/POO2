/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_MVC;

import View_MVC.JanelaPrincipal;
import View_MVC.TelaAtendente;
import View_MVC.TelaConsulta;
import View_MVC.TelaHBT;
import View_MVC.TelaVendas;
import View_MVC.Tela_Principal;

public class ControllerJFrame {
    JanelaPrincipal view  = new JanelaPrincipal();
    
        public ControllerJFrame(){
        view.setSize(1000,500);
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        }

    public JanelaPrincipal getView() {
        return view;
    }
        
}
